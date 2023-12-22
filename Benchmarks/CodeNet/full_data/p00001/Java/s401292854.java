import java.awt.List;
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			String str;
			str = br.readLine();
			arr[i] = Integer.parseInt(str);
		}
		Arrays.sort(arr);
		for (int i = 9; i > 6; i--)
			System.out.println(arr[i]);
	}
}