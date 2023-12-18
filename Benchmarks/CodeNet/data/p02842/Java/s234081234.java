import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long N = Long.parseLong(W);

		String ans = ":(";

		for(int i=1;i<5000;i++){
			if(N==(long)(i*1.08)){
				ans = String.valueOf(i);
				break;
			}
		}



		System.out.println(ans);



	}


}
