import java.util.*;
import java.util.Map.Entry;
 
class Main {
//	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
//       int M = sc.nextInt();
       long[] a = new long[(int)N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
       }
       boolean flg=false;
       Arrays.sort(a);
       if(a[0]!=0) {
	       System.out.println(0);
		   return;    	   
       }
       long ans=1;
       int cnt=1;
       for(int i=1;i<N;i++) {
    	   if(a[i]==cnt) {
        		   ans=(ans*cnt)%mod;    			   
    	   } else if(a[i]==cnt+1) {
    		   cnt++;
    		   ans=(ans*cnt)%mod;    		   
    	   } else {
    	       System.out.println(0);
    		   return;
    	   }
       }
       
       System.out.println(ans);
   }
      

}