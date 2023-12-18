import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String Str = in.readLine();

		int N=0;
		int S=0;
		int W=0;
		int E=0;
		for(int i=0;i<Str.length();i++){
			switch (Str.charAt(i)){
			case 'N':
				N++;
				break;
			case 'S':
				S++;
				break;
			case 'W':
				W++;
				break;
			case 'E':
				E++;
				break;
			}
		}

		String ans = "Yes";
		if((N==0&&S!=0) || (N!=0&&S==0) ||(E==0&&W!=0) || (E!=0&&W==0)){
			ans="No";
		}

		System.out.println(ans);


	}
}
