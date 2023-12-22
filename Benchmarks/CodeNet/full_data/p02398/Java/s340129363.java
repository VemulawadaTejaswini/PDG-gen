import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String[] strArray = br.readLine().split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		int c = Integer.parseInt(strArray[2]);

		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (c%i == 0) {cnt++;}
		}
		System.out.println(cnt);
	}
}