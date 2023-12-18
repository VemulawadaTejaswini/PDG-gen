import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		String S = in.readLine();
		int ans =0;
		char bef = '-';
		for(int i=0;i<N;i++){
			if(bef==S.charAt(i)){

			}else{
				bef=S.charAt(i);
				ans++;
			}
		}

		System.out.println(ans);
	}
}
