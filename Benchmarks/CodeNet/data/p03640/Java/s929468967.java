import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int H = sc.nextInt();
       int W = sc.nextInt();
       int N = sc.nextInt();
       
       long[] a = new long[(int)N];
       long[] m= new long[H*W];
       int mcnt=0;
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
           for(int j=0;j<a[i];j++) {
        	   m[mcnt]=i+1;
        	   mcnt++;
           }
       }
 
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       int[][] am=new int[H][W];
       int cnt=0;
       for(int i=0;i<H;i++) {
    	   if(i%2==0) {
    		   for(int j=W-1;j>=0;j--) {
    			   am[i][j]=(int) m[cnt];
    			   cnt++;
    		   }
    	   } else {
    		   for(int j=0;j<W;j++) {
    			   am[i][j]=(int) m[cnt];
    			   cnt++;
    		   }    		   
    	   }
    	   for(int j=0;j<W;j++) {
    		   System.out.print(am[i][j]);
    		   if(j!=W-1) {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println("");
       }
       
   }


}