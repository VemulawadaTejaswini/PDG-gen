import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String P = br.readLine().toLowerCase();
			char p[] = P.toCharArray();

			String tmp;
			StringBuilder sb = new StringBuilder();

			while(!(tmp = br.readLine()).equals("END_OF_TEXT")){
				sb.append(tmp.toLowerCase());
			}

			char line[] = sb.toString().toCharArray();

			int ans = 0;
			boolean FLG;

			for(int start = 0; start+P.length()-1 < line.length; start++){
				FLG = true;

				for(int i = 0; i < P.length(); i++){
					if(p[i] != line[start+i]){
						FLG = false;
						break;
					}
				}
				if(FLG)ans++;
			}

			System.out.println(ans);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
