
import java.util.*;

import java.math.*;


public class Main { 
	static long[] dp;
    static int mod=(int)1e9+7;
    public static  void help(String s, int k) {
      dp=new long[200000];
     
      fun(s);
    }
    
    
 
    static	void  fun(String s) {
		int n = s.length();

		long rem[] = new long[2019];

		int digit = 0, power = 1;
		for (int i = n - 1; i >= 0; --i) {
			digit = (power * (s.charAt(i) - '0') + digit) % 2019;
			power = (power * 10) % 2019;
			++rem[digit];

		}
		
		long ans = 0;
		for (int i = 0; i < 2019; ++i) {
			if (rem[i] > 0) {
				ans += (rem[i] * (rem[i] - 1)) / 2;
			}
		}
		System.out.println(ans);
	}

   
	    
	public static void main(String args[] ) throws Exception {
		Scanner s=new Scanner(System.in);
	//	String hs="1817181712114";
		String hs=s.next();
		help(hs,2019);
		
}


} 
