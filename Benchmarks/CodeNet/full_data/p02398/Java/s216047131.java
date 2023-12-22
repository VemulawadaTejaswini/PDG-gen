import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main (String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String[] strAry = br.readLine().split(" ");
		int a = Integer.parseInt(strAry[0]);
		int b = Integer.parseInt(strAry[1]);
		int c = Integer.parseInt(strAry[2]);
		int count = 0;
		for (int i = a; i <= b; i++) {
			if ((c % i) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}