import java.util.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] A = new int[N+2];
       int[] B = new int[N+1];

       int cnt = 0;
       int wk = 0;
       int wk2 = 0;
       for(int i=0;i<N+1;i++) {
           A[i] = sc.nextInt();
       }
       for(int i=0;i<N;i++) {
           B[i] = sc.nextInt();
       }
       
       for(int i=0;i<N;i++) {
    	   wk = B[i] - A[i];
    	   if(wk<=0) {
    		   cnt = cnt + B[i];
    	   } else {
    		   cnt = cnt + A[i];
    		   wk2 = A[i+1] - wk;
    		   if(wk2<=0) {
    			   cnt = cnt + A[i+1];
    			   A[i+1] = 0;
    		   } else {
    			   A[i+1] = wk2;
    			   cnt = cnt + wk;
    		   }
    	   }
    	   
    	   
    	   
    	   
       }
       System.out.print(cnt);

   }
}
