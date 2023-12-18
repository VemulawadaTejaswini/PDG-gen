import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
//       int B = sc.nextInt();
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       int f = 0;
       int l = 0;
       int fl = 0;
       int cnt=0;
       for (int i=0 ; i<N; i++) {
           String S = sc.next();
           char[] s = S.toCharArray();
           if(s[0]=='B'&& s[s.length-1]=='A') {
        	   fl++;
           } else if(s[0]=='B') {
        	   f++;
           } else if(s[s.length-1]=='A') {
        	   l++;
           }
           while(S.indexOf("AB")!=-1) {
        	   S=S.substring(S.indexOf("AB")+2);
        	   cnt++;
           }
       }
       
       int k=Math.min(fl, Math.min(f,l));
       cnt=cnt+k*2;
       fl=fl-k;
       l=l-k;
       f=f-k;
       
       if(fl!=0) {
    	   int max =Math.max(f,l);
    	   if(fl>max) {
    		   cnt=cnt+fl+max-1;
    	   } else {
    		   cnt=cnt+max;
    	   }
       } else {
    	   cnt=cnt+Math.min(f, l);
       }
       System.out.println(cnt);
   }
      

}