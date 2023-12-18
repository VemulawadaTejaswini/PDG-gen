import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		int x500 = N/500;
		N=N%500;
		int x5 = N/5;
		System.out.println(x500*1000+x5*5);

	}

}
