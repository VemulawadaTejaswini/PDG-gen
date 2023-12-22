import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			String[] splited = br.readLine().split(" ");
			int[] array = new int[3];
			array[0] = Integer.parseInt(splited[0]);
			array[1] = Integer.parseInt(splited[1]);
			array[2] = Integer.parseInt(splited[2]);
			Arrays.sort(array);
			if (array[0] % 3 == 0 && 
					array[1] % 4 == 0 && 
					array[2] % 5 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		br.close();
	}
}