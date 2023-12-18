import java.util.*;
import java.util.Map.Entry;
 
class Main {
//	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
//       int M = sc.nextInt();
       int[] a = new int[(int)N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextInt();
       }
       long ans=1;
       if(a[0]!=0) {
    	   System.out.println(0);
    	   return;		  
       }
       int[] cntm=new int[N];
       cntm[0]++;
       int max=0;
       for(int i=1;i<N;i++) {
    	   cntm[a[i]]++;
    	   max=Math.max(max,a[i]);
       }
       for(int i=1;i<max;i++) {
    	   ans=(long)((ans*(Math.pow(cntm[i-1],cntm[i])%mod))%mod);
       }
       
       System.out.println(ans);
   }
      

}