import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(buff.readLine());
		String[] box = buff.readLine().split(" ");
		int[] num_box = new int[box.length];
		int count = 0;
		for(int i = 0; i < n; ++i){
			num_box[i] = Integer.parseInt(box[i]);
		}
		while(true){
			boolean flag = true;
			for(int i = 0; i < n; ++i){
				if(num_box[i] % 2 == 0){
					num_box[i] /= 2;
				} else {
					flag = false;
					break;
				}
			}

			if(flag == false){
				break;
			} else {
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