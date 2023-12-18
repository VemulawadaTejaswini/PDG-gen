import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();
		String x;

			if (a[0] == b[2]&&a[1]==b[1]&&a[2]==b[0]) {
				x="YES";
			}else {
				x="NO";
			}
			System.out.println(x);
		}
	}