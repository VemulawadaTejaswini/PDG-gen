import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		String[] strAry = bf.readLine().split(" ");
		int a = Integer.parseInt(strAry[0]);
		int b = Integer.parseInt(strAry[1]);
		if (a == b) {
			System.out.println("a == b");
		} else if (a > b) {
			System.out.println("a > b");
		} else if (a < b) {
			System.out.println("a < b");
		}
	}
}