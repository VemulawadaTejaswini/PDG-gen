import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int a = Integer.parseInt(W);
		 W = in.readLine();

		int b = Integer.parseInt(W);
		 W = in.readLine();

		int h = Integer.parseInt(W);

		System.out.println((a+b)*h/2);
	}
}
