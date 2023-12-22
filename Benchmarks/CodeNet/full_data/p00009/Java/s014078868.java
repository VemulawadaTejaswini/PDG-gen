import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		long time;
		while ((str = br.readLine()) != null) {
			time = System.currentTimeMillis();
			int num = Integer.parseInt(str);
			int count =0;
			int n = (int)Math.sqrt(num);
			boolean[] list = new boolean[num];
			Arrays.fill(list,true);
			list[0] = false;
			for (int i = 2; i < n + 1; i++) {
				if (list[i-1] != false) {
					for (int j = 2; j <= num; j++) {
						if (j % i == 0){
							list[j-1] = false;
						}
					}
				count++;
				}
			}
			for (int i = 2; i <= num; i++) {
				if (list[i-1] == true) {
					count++;
				}
			}
			System.out.println(count);
			time = System.currentTimeMillis() - time;
			System.out.println(time + "msec");
		}
	}

}