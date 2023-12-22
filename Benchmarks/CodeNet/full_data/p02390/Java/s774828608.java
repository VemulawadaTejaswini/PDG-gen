import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int S = Integer.parseInt(str);

		//		Watch1 w1 = new Watch1();
		//		String x = w1.henkan(h,m,s);
		System.out.println(S / 3600 + ":" + (S % 3600) / 60 + ":" + (S % 3600) % 60);
	}

}

