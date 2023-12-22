import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				int parson = Integer.parseInt(br.readLine());
				if (parson == 0)
					break;
				int point[] = new int[parson];
				int max = 0;
				int min = 0;
				int maxI = 0;
				int minI = 0;
				for (int i = 0; i < parson; i++) {
					point[i] = Integer.parseInt(br.readLine());
					max = Math.max(max, point[i]);
					min = Math.min(min, point[i]);
					if (max == point[i])
						maxI = i;
					if (min == point[i]) {
						minI = i;
					}
				}
				int result = 0;
				for (int i = 0; i < parson; i++) {
					if (i != maxI && i != minI) {
						result += point[i];
					}
				}
				System.out.println(result / (parson - 2));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
