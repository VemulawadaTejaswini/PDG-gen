import java.util.*;
public class Main {
	static String S;
	static int p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			double n = sc.nextDouble();
			if(n == -1) break;
			int ck = (int)n;
			
			boolean ans = true;
			if(Integer.toBinaryString(ck).length() >= 9) ans = false;
			String ansZZ = "";
			for(int i = 0; i < 8 - Integer.toBinaryString(ck).length(); i++) {
				ansZZ += 0;
			}
			ansZZ += Integer.toBinaryString(ck);
			String ansx = bi(n - ck);
			if(ans && ansx.length() <= 5) {
				System.out.println(ansZZ + ansx);
			
			}
			else System.out.println("NA");
		}
		
	}
	static String bi(double a) {
		String ret = ".";
		
		for(int i = 0; i < 8; i++) {
			if(a == 0.0) break;
			a *= 2;
			if(a >= 1.0) {
				ret += "1";
				a -= 1.0;
			}
			else {
				ret += "0";
			}
		}
		for(int i = 0; i <= 6 - ret.length(); i++) {
			ret += "0";
		}
		return ret;
		
		
	}

}