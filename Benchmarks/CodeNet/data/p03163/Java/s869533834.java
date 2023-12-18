import java.util.*;
public class Main{
public static void sortbyColumn(int arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        });  // End of function call sort(). 
    } 
public static void main(String args[]){
     int N,W;
    Scanner obj=new Scanner(System.in);
    N=obj.nextInt();
    W=obj.nextInt();
    int arr[][]=new int[N+1][2];
    arr[0][0] = 0;
    arr[0][1] = 0;
    for(int i=1;i<=N;i++){
    for(int j=0;j<2;j++){
     arr[i][j]=obj.nextInt();
   }
   
   }

sortbyColumn(arr,0);

long dp[][]=new  long[N+1][W+1];
for(int i=1;i<=N;i++){
   for(int j=1;j<=W;j++){
     if(j-arr[i][0] >= 0) {
    	 dp[i][j]=arr[i][1];
    	 dp[i][j]+=dp[i-1][j-arr[i][0]];
     }
     dp[i][j]=Math.max(dp[i-1][j], dp[i][j]);
     //System.out.print(dp[i][j]+" ");
   }
   //System.out.println();
}


System.out.println(dp[N][W]);
 
}

}
