import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
		String str = br.readLine();
		int N = Integer.parseInt(str);

		List<Integer> als = new ArrayList<Integer>();
		String[] str2 = br.readLine().split(" ");

		for (int i = 0; i < str2.length; i++) {
			if(i<10000){
				if (!als.contains((str2[i]))) {
					als.add(Integer.parseInt(str2[i]));
				}
			}else{
				als.add(Integer.parseInt(str2[i]));
			}

			boolean isRoop = false;

			int max = 0;
			int min = 0;
			do {
				isRoop = false;
				min = Collections.min(als);

				for (int j = 0; j < als.size(); j++) {

					if (als.get(j) != min) {
						if (als.get(j) % min != 0) {
							als.set(j, als.get(j) % min);
							isRoop = true;
						} else {
							als.remove((Object) als.get(j));
							isRoop = true;
						}
					}
				}

			} while (isRoop);



		}
		System.out.println(Collections.max(als));
	}
}