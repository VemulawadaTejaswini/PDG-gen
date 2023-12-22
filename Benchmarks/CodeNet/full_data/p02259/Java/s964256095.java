import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
		   int N = Integer.parseInt(br.readLine());

		   String input_str[] = br.readLine().split("\\s+");
		   int table[] = new int[input_str.length];

		   for(int i = 0; i < input_str.length; i++){

			   table[i] = Integer.parseInt(input_str[i]);
		   }

		   int ans = 0;
		   int work = 0;

		   for(int base = 0; base < table.length-1; base++){
			   for(int loc = table.length-1; loc > base; loc--){

				   if(table[loc] < table[loc-1]){

					   work = table[loc-1];
					   table[loc-1] = table[loc];
					   table[loc] = work;

					   ans++;
				   }
			   }
		   }

		   System.out.printf("%d", table[0]);

		   for(int i = 1; i < table.length; i++){

			   System.out.printf(" %d", table[i]);
		   }
		   System.out.println();
		   System.out.println(ans);

		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
