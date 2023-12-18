import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int A = Integer.parseInt(W);
		W = in.readLine();
		int B = Integer.parseInt(W);



		System.out.println(6-(A+B));



	}


}
