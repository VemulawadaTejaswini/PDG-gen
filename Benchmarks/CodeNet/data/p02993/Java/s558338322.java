import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		boolean flg = true;
		for(int i=0;i<W.length()-1;i++){
			if(W.charAt(i) == W.charAt(i+1)){
				System.out.println("Bad");
				flg = false;
				break;
			}

		}
		if(flg)
			System.out.println("Good");
	}
}
