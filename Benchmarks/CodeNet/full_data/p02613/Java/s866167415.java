import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main{
	public static long mod(long x, long e, long m){
		String bi = Long.toBinaryString(e);
		long y = 1;
		for(int i = 0; i < bi.length(); i++){
			if(bi.charAt(i) == '1'){
				y = (y*y*x)%m;
				System.out.println(y);
			}else{
				y = (y*y)%m;
				System.out.println(y);
			}
		}
		return y;
	}
    
	public static void main(String[] $){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		int AC = 0;
		int WA = 0;
		int TLE = 0;
		int RE = 0;
		for(int i = 0; i < N; i++){
			S[i] = sc.next();
			if(S[i].equals("AC")){
				AC++;
			}else if(S[i].equals("WA")){
				WA++;
			}else if(S[i].equals("TLE")){
				TLE++;
			}else{
				RE++;
			}
		}
		
		System.out.println("AC x " + AC);
		System.out.println("WA x " + WA);
		System.out.println("TLE x " + TLE);
		System.out.println("RE x " + RE);
		
	}
} 