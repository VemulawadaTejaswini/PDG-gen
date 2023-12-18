import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		double tan = ((double) x) / a;   //丸の面積
		//System.out.println(tan);    //////////////
		tan = tan * 2.0 / b;     // x
		//System.out.println(tan);    //////////////
		tan = tan / b;
		//System.out.println(tan);    //////////////
		double ans = 90 - Math.toDegrees(Math.atan(tan));
		System.out.println(ans);
	}
}
