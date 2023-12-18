import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(buff.readLine());
		int[] num_box = new int[N];
		int[] bucket = new int[101];
		for(int i = 0; i < N; ++i){
			num_box[i] = Integer.parseInt(buff.readLine());
			bucket[num_box[i]] = 1;
		}

		int count = 0;
		for(int i = 0; i < 101; ++i){
			if(bucket[i] == 1){
				count++;
			}
		}
		System.out.println(count);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}