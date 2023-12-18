import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		long A =  Long.parseLong(W.split(" ")[0]);
		long B =  Long.parseLong(W.split(" ")[1]);
		long C =  Long.parseLong(W.split(" ")[2]);
		long D =  Long.parseLong(W.split(" ")[3]);

		A = A-1;
		long N = B - A ;

		long lcm = lcm(C,D);

		long AmodC = A /C;
		long AmodD = A /D;
		long AmodLCM = A/(lcm);

		long BmodC = B /C;
		long BmodD = B /D;
		long BmodLCM = B/(lcm);

		long ans = N - BmodC - BmodD + BmodLCM + (AmodC + AmodD - AmodLCM);


		System.out.println(ans);
	}


	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}

}
