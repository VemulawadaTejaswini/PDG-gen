import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long[] kaijo;
	 static long[] kaiinv;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       
       Long[][] mi= new Long[N][2];
       long[] a = new long[(int)N];
       for (int i=0 ; i<N; i++) {
           long x = sc.nextLong();
           long y = sc.nextLong();
           mi[i][0]=x-y;
           mi[i][1]=x+y;
       }
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       int cnt=0;
       Arrays.sort(mi, (b, c) -> Long.compare(b[0], c[0])); 
       for(int i=0;i<N-1;i++) {
    	   if(mi[i][1]>mi[i+1][0]) {
    		   cnt++;
    		   mi[i+1][1]=Math.min(mi[i][1], mi[i+1][1]);
    	   }
       }
       
       
       System.out.println(N-cnt);
   }


}