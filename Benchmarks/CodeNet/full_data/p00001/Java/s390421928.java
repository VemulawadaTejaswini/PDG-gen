import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(array);
		for (int i = 9; 6 < i; i--) {
			System.out.println(array[i]);
		}
	}
}