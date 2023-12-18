import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * --------------------------------------------------
 * Main Class
 * --------------------------------------------------
 */
public class Main {

	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		String ret = "";
		if(d < Math.abs(b-a)/(n-1)) {
			//aとbの差が大きすぎる
			ret = "NO";
		} else if (c*2/(d-c)+2 <= n) {
			//規定回数のうちに移動不可能帯域がなくなる
			ret = "YES";
		} else {
			//nが偶数=aからbまでの遷移回数k
			int k = n-1;
			//移動可能帯域はc+dごとに繰り返しパターンを描くのでc+dの領域を調査すればOK
			int pos = Math.abs(b-a) % (c+d);
			if (k%2==1) {
				//kが奇数回
				int yesStr = c - (k-1)*(d-c)/2;
				int yesEnd = yesStr + k * (d-c);
				ret =  (yesStr <= pos && pos <= yesEnd) ? "YES" : "NO";
			} else {
				//kが偶数回
				int noStr = k*(d-c)/2;
				int noEnd = noStr + 2*c - (k+1) * (d-c);
				ret =  (noStr < pos && pos < noEnd) ? "NO" : "YES";
			}
		}
		
		out.println(ret);
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
//		long time = System.currentTimeMillis();
		new Main().exec();
//		System.out.println(System.currentTimeMillis() - time);
	}
}
