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
       
       if(Math.max(f,l)==0) {
    	   	cnt=cnt+Math.max(0,fl+1);
       } else {
    		cnt=cnt+fl+Math.min(f,l);
       }
       System.out.println(cnt);
   }
      

}