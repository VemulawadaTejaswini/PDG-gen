import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int table[] = new int[128];

		for(int i = 0; i < table.length; i++){
			table[i] = 0;
		}

		try{
			String inputed = br.readLine();

			for(int i = 0; i < inputed.length(); i++){
				table[inputed.charAt(i)]++;
			}

			for(int i = 0; i < 26; i++){
				System.out.printf("%c : %d\n", 'a'+i,table['a'+i]+table['a'+i-32]);
			}

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
