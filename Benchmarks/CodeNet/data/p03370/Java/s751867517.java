import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));


		int N = 0, MAX = 0;
		String[] box = buff.readLine().split(" ");
		N = Integer.parseInt(box[0]);
		MAX = Integer.parseInt(box[1]);
		int MIN = 1001;
		int count = 0;

		for(int i = 0; i < N; ++i){
			int m = Integer.parseInt(buff.readLine());
			if(MIN > m){
				MIN = m;
			}
			MAX -= m;
			count++;
		}

		System.out.println(((MAX / MIN) + count));

	}

	static long f() {
		long ans = 0;


		return ans;
	}
}