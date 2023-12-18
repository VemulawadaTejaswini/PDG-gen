import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int P = input.nextInt();
		String S = input.next();
		long cnt = 0;
		if (P==2) {
			for (int i = S.length()-1; i >= 0; i--) {
				int D = Integer.parseInt(S.substring(i,i+1));
				if (D%2==0) cnt+=i+1;
			}
		}else if (P==5) {
			for (int i = S.length()-1; i >= 0; i--) {
				int D = Integer.parseInt(S.substring(i,i+1));
				if (D==0||D==5) cnt+=i+1;
			}
		}else {
			int[] mod = new int[P];
			mod[0]++;
			int pow_10 = 1;
			int curNum = 0;
			for (int i = S.length()-1; i >= 0; i--) {
				int D = Integer.parseInt(S.substring(i,i+1));
				curNum+=D*pow_10;
				curNum%=P;
				mod[curNum]++;
				pow_10*=10;
				pow_10%=P;
			}
			for (int i = 0; i < P; i++) {
				cnt+=mod[i]*(mod[i]-1)/2;
			}
		}
		System.out.println(cnt);
	}
}