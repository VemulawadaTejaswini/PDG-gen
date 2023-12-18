import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(reader.readLine());
			String[] s = reader.readLine().split(" ");
			int[] A = Stream.of(s).mapToInt(Integer::parseInt).toArray();

			String ans = "YES";
			Arrays.sort(A);
			for(int i=1; i<N; i++) {
				if(A[i] == A[i-1])
					ans = "NO";
			}

			System.out.println(ans);
		}catch(IOException e) {

		}
	}

}
