import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");

		long a = Long.parseLong(Ws[0]);
		long b = Long.parseLong(Ws[1]);

		String A = "";
		String B = "";
		for(int i=0;i<b;i++){
			A+=String.valueOf(a);
		}

		for(int i=0;i<a;i++){
			B+=String.valueOf(b);
		}

		System.out.println(A.compareTo(B)<=0?A:B);
	}
}
