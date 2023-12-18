import java.util.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] A = new int[N+1];
       int cnt = 0;
       for(int i=1;i<N;i++) {
           A[i] = sc.nextInt();
       }
       
       for(int i=1;i<N;i++) {
    	   if(A[i]!=i) {
    		   A[A[i]] = A[i];
    		   A[i]=i;
    		   cnt++;
    	   }
       }
       
       
       if(cnt<2) {
           System.out.print("YES");
    	   
       }else {
           System.out.print("NO");
    	   
       }
       
   }
}