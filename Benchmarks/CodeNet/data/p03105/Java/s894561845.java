package AtCoder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AtCoder_20190323_AGC {
	public static void main(String[] args)  throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);

		int ans = 0;
		if (A * C <= B) {
			ans = C;
		}
		else {
			ans = B / A;
		}
		System.out.println(ans);
	}
}