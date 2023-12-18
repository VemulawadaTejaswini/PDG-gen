import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        
	        int wcnt=0;
	        for(int i=0;i<N;i++) {
	        	if(c[i]=='#')break;
	        	wcnt++;
	        }
	        
	        int wcnt2=0;
	        int bcnt=0;
	        for(int i=wcnt;i<N;i++) {
	        	if(c[i]=='#') {
	        		bcnt++;
	        	} else {
	        		wcnt2++;
	        	}
	        }
	        
	        
	        System.out.println(Math.min(bcnt, wcnt2));
	 }
	 

}