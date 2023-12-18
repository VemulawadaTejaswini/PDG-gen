import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] ws = W.split(" ");
		int A = Integer.parseInt(ws[0]);
		int B = Integer.parseInt(ws[1]);
		int C = Integer.parseInt(ws[2]);

		int x = A-B;
		int y = C-x;
		if(y<=0){
			y=0;
		}
		System.out.println(y);


	}

}
