import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String[] box = buff.readLine().split(" ");
		int N = Integer.parseInt(box[0]);
		long Y = Long.parseLong(box[1]);
		boolean flag = true;
		for(int i = 0; i <= N; ++i){
			for(int j = 0; j <= N - i; ++j){
				for(int k = 0; k <= N - i - k; ++k){
					long tmp = 10000 * i + 5000 * j + 1000 * k;
					if(Y == tmp){
						flag = false;
						System.out.println(i + " " + j + " " + k);
						break;
					}
				}
				if(flag == false){
					break;
				}
			}
			if(flag == false){
				break;
			}
		}
		if(flag){
			System.out.println("-1 -1 -1");
		}
	}

	static long f() {
		long ans = 0;


		return ans;
	}
}