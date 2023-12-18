import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Atcoder用
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int c = Integer.parseInt(tmp[2]);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();
		for(char c:s)System.out.println(c);

		List<Integer> ls = new ArrayList<Integer>();
		String[] tmp = br.readLine().split(" ");
		for (int n = 0; n < N; n++) {
			ls.add(Integer.parseInt(tmp[n]));
		}
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int K = Integer.parseInt(tmp[1]);

		List<Integer> ls = new ArrayList<Integer>();
		String[] foo = br.readLine().split(" ");
		//for (int n = 0; n < N; n++) {
			//ls.add(Integer.parseInt(foo[n]));
		//}

		int ans = 0;
		if((N-1)%(K-1) != 0){
			ans = (int)Math.floor((N-1)/(K-1));
			ans++;
		}else{
			ans = (int)((N-1)/(K-1));
		}

		System.out.println(ans);
	}
}