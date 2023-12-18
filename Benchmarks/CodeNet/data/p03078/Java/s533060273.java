import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		int X = Integer.parseInt(tmp[0]);
		int Y = Integer.parseInt(tmp[1]);
		int Z = Integer.parseInt(tmp[2]);
		int K = Integer.parseInt(tmp[3]);

		List<Long> A = new ArrayList<Long>();
		List<Long> B = new ArrayList<Long>();
		List<Long> C = new ArrayList<Long>();


		tmp = br.readLine().split(" ");
		for(int a = 0;a<X;a++)A.add(Long.valueOf(tmp[a]));

		tmp = br.readLine().split(" ");
		for(int a = 0;a<Y;a++)B.add(Long.valueOf(tmp[a]));

		tmp = br.readLine().split(" ");
		for(int a = 0;a<Z;a++)C.add(Long.valueOf(tmp[a]));

		Collections.sort(A,Comparator.reverseOrder());
		Collections.sort(B,Comparator.reverseOrder());
		int roop = Math.min(Math.min(A.size(),B.size()),C.size());
		List<Long> result = new ArrayList<Long>();

		for(int x = 0;x<roop;x++){
			for(int y = 0;y<roop;y++){
				for(int z = 0;z<roop;z++){
					result.add(A.get(x) + B.get(y) + C.get(z));
				}
			}
		}

		Collections.sort(result,Comparator.reverseOrder());

		for(int i = 0;i<K;i++){
			System.out.println(result.get(i));
		}

	}

}