import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		String Ans = "";
		while(N != 0){
			N = N-1;
			long mod = N%26;
			int mod2 = (int)mod;
			char a = (char)('a'+mod2);
			Ans = String.valueOf(a) + Ans;
			N = N/26;
		}
		System.out.println(Ans);
		
		
			
	}
} 