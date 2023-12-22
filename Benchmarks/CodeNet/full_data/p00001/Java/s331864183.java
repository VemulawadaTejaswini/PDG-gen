import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		String str = "";
		int num[] = new int[10];
		int top[] = new int[3];
		for (int i = 0; i < 10; i++) {
			str = br.readLine();
			num[i] = Integer.parseInt(str);
			if (top[0] < num[i]) {
				top[2] = top[1];
				top[1] = top[0];
				top[0] = num[i];
			} else if (top[1] < num[i]) {
				top[2] = top[1];
				top[1] = num[i];
			} else if (top[2] < num[i]) {
				top[2] = num[i];
			}
		}
		System.out.println(top[0]);
		System.out.println(top[1]);
		System.out.println(top[2]);
	}
}