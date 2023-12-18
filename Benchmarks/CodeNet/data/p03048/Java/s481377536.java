import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//		String line = reader.readLine();
		String[] str = reader.readLine().split(" ");
		int[] ab = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			ab[i] = Integer.parseInt(str[i]);
		}
		
		int ans = 0;
		for (int r = 0; r <= ab[3]/ab[0]; r++)
			for (int g = 0; g <= ab[3]/ab[1]; g++)
				for (int b= 0; b <= ab[3]/ab[2]; b++) {
					if (ab[0] * r + ab[1] * g + ab[2] * b == ab[3]) {
						ans++;
					}
				}
		System.out.println(ans);
	}
}
