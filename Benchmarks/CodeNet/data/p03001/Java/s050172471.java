import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int W = Integer.parseInt(str[0]);
		int H = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		int y = Integer.parseInt(str[3]);
		boolean flag = false;
		
		double ans = W * H / 2.0;
		if (W / 2.0 == x && H / 2.0 == y) {
			flag = true;
		}
		
		System.out.print(ans + " ");
		if (flag) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}