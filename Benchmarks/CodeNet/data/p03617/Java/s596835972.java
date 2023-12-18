import java.util.Scanner;

public class Main {

	
	

	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] arr = {25,50,100,200};
		
		int wt[] = new int[4];
		
		for(int i = 0 ; i < 4 ;i++)
			wt[i] = scan.nextInt();
		
		int w = scan.nextInt() * 100;
		
		System.out.println(M_dp(arr,wt,w));
		
		scan.close();
	}
	
	

    /* ========================================================
       M_dp(W) = max value achieved by knapsack with capacity W
       ======================================================== */
    static int M_dp(int[] v, int[] w, int W)
    {
       int[] sol, mySol;
       int i, myFinalSol;

       int[] M;                 // Data structure to store results
       int   C;                 // Index to run through M[]

       sol   = new int[v.length];
       mySol = new int[v.length];

       M = new int[W + 1];      // Create array

       /* ---------------------------
          Base cases
          --------------------------- */
       M[0] = 0;

       /* ==============================================
          The other values M[C]
          ============================================== */
       for ( C = 1; C <= W; C++ )
       {
          /* ---------------------------------------
             Solve the appropriate smaller problems
             --------------------------------------- */
          for ( i = 0; i < v.length; i++ )
          {
             if ( C >= w[i] )
                sol[i] = M[ C-w[i] ]; // Knapsack capacity reduced by w[i]
                                      // because it has item i packed in
                                      // it already
             else
                sol[i] = 0;        // Not enough space to  pack item i
          }

          /* ---------------------------------------------
             Use the solutions to the smaller problems
             to solve original problem
             --------------------------------------------- */
          for ( i = 0; i < v.length; i++ )
          {
             if ( C >= w[i] )
                mySol[i] = sol[i] + v[i];   // Value is increased by v[i]
                                            // because it has item i packed in
                                            // it already
             else
                mySol[i] = 0;        // Not enough space to  pack item i
          }

          /* *************************
             Find the best (maximum)
             ************************* */
          M[C] = mySol[0];
         // System.out.println(C + "  " + W);
          //System.out.println(M[C]);
          for ( i = 1; i < v.length; i++ )
             if ( mySol[i] > M[C] ) {
                 M[C] = mySol[i];
             }
          if(M[C] == W) {
        	  return C;
          }
       }
      
       return M[ W ];     // Return best value for knapsack of cap = W
   }
		
	
}