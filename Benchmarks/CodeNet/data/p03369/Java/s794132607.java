import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String[] box = buff.readLine().split("");
		for(int i = 0; i < 3; ++i){
			if(box[i].equals("o")){
				count++;
			}
		}
		System.out.println(700 + (100 * count));

	}

	static long f() {
		long ans = 0;


		return ans;
	}
}