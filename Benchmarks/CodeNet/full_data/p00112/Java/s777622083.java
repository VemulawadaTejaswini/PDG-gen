import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				int time[] = new int[n];
				int sum = 0;
				for (int i=0;i<n;i++) {
					time[i] = Integer.parseInt(br.readLine());
				}
				Arrays.sort(time);
				int count = n-1;
				while (count>=1) {
					for (int i=0;i<count;i++) {
						sum += time[n-1-count];
					}
					count--;
				}
				System.out.println(sum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}