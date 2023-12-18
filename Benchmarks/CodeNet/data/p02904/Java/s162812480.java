import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int k = Integer.parseInt(inputs[1]);

		inputs = br.readLine().split(" ");
		StringBuilder p = new StringBuilder();
		for ( int i = 0; i < n; i++ ) {
			p.append(inputs[i]);
		}

		StringBuilder prev = new StringBuilder("");
		int cnt = 0;
		HashSet<String> result = new HashSet<>();
		for ( int i = 0; i <= n - k; i++ ) {

			// char sub1[] = p.subSequence(i, i + k).toString().toCharArray();
			char sub2[] = p.subSequence(i, i + k).toString().toCharArray();
			Arrays.sort(sub2);

			//if ( !sub2.equals(sub1) ) {
				String targ = ""; // new StringBuilder();
				targ += p.subSequence(0, i).toString() + String.valueOf(sub2) + p.subSequence(i + k, p.length()).toString() ;
				result.add(targ);
				// System.out.println(targ);
				
//				if(!targ.equals(prev)) {
//					prev = targ;
//					cnt++;
//					System.out.println(targ);
//				}
			//}
		}
		
		System.out.println(result.size());

		br.close();

	}

}
