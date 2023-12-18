import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] sW = W.split(" ");

		int A = Integer.parseInt(sW[0]);
		int B = Integer.parseInt(sW[2]);
		long ans = 0;
		if("+".equals(sW[1])){
			ans = A+B;
		}else{
			ans = A-B;
		}
		System.out.println(ans);
	}




}
