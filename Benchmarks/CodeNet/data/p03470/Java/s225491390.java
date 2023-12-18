import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(buff.readLine());
		int[] num_box = new int[N];
		for(int i = 0; i < N; ++i){
			num_box[i] = Integer.parseInt(buff.readLine());
		}
		Arrays.sort(num_box);

		int pre = 0;
		int count = 0;
		for(int i = 0; i < N; ++i){
			if(pre < num_box[i]){
				count++;
				pre = num_box[i];
			}
		}
		System.out.println(count);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}