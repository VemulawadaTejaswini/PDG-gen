import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Throwable {
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		String[] s = vd.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int k = Integer.parseInt(vd.readLine());
		double sum=0;
		if((a>=b)&&(a>=c)) {
			sum = a*Math.pow(2, k) + b + c;
		}else if((b>a)&&(b>=c)) {
			sum = b*Math.pow(2, k) + a + c;
		}else if((c>a)&&(c>b)) {
			sum = c*Math.pow(2, k) + a + b;
		}
		System.out.println(sum);
	}
}
