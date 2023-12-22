import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int n = Integer.parseInt( br.readLine() );
	   String[] string =  br.readLine().split(" ");
       int[] S = new int[n];


       for(int i = 0; i < n; i++ ){

    	   S[i] = Integer.parseInt( string[i] );

       }

       int q = Integer.parseInt( br.readLine() );
	   String[] stringq =  br.readLine().split(" ");
       int[] T = new int[q];


       for(int i = 0; i < q; i++ ){

    	   T[i] = Integer.parseInt( stringq[i] );

       }


       int answer = 0;


       for(int i = 0; i < q ; i++ ){

           answer += binarysearch(S , n, 0, T[i] );

       }

     System.out.println(answer);


   }




   public static int binarysearch(int[] S, int right, int left, int key){


	   while(left < right){
		   int mid = (right + left)/2;
           if( S[mid] == key ){
              return 1;
           }
           else if(key < S[mid] ){
        	  right = mid;
           }
           else{
        	   left = mid + 1;
           }
	   }


	   return 0;
   }


}