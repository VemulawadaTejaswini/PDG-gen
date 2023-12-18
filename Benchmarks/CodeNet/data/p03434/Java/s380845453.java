import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(buff.readLine());
		String[] box = buff.readLine().split(" ");
		int[] num_box = new int[N];
		for(int i = 0; i < N; ++i){
			num_box[i] = Integer.parseInt(box[i]);
		}
		int alice = 0, bob = 0;
		boolean flag = true;
		while(N-- > 0){
			int max = 0, max_indx = 0;
			for(int i = 0; i < num_box.length; ++i){
				if(max < num_box[i]){
					max_indx = i;
					max = num_box[i];
				}
			}
			num_box[max_indx] = 0;

			if(flag){
				alice += max;
			} else {
				bob += max;
			}
			flag = !flag;
		}

		System.out.println(alice - bob);
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}