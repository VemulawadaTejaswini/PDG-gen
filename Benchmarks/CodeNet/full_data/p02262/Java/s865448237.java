

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt( br.readLine() );
	 int cnt;

	 int m = n;
	 int [] G = new int[m];
	 //G[0] = 4;
     //G[1] = 1;
	 G[0] = 1;

	 int I;
	 for (I = 0; I < 100 && G[I] < m; I++) {
         G[I + 1] = 3 * G[I] + 1;
     }

     if(I>0){
    	 m = I;
     }

    int [] A = new int[n];
    for(int i = 0; i < n ; i++){
          A[i] = Integer.parseInt( br.readLine() );
    }

    cnt = 0;
    for(int i = 0; i < m ; i++){

       for( int j = G[(m-1)-i]; j < n ; j++ ){
    	   int v = A[j];
    	   int x = j - G[(m-1)-i];

    	   while( x >= 0 && A[x] > v ){
    		   A[x+G[(m-1)-i]] = A[x];
               x = x-G[(m-1)-i];
               cnt++;
    	   }
    	   A[x+G[(m-1)-i]] = v;

       }

    }

     System.out.println(m);
    for(int i = 0; i < m ; i++){
    	System.out.print(G[i]);
        if(i < m-1){
            System.out.print(" ");
        }
    }
    System.out.println();
    System.out.println(cnt);

    for(int i = 0; i < n ; i++){
    	System.out.println(A[i]);

    }

 }
}