import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 97-122
		Scanner sc = new Scanner(System.in);
		ArrayList<char[]> arr = new ArrayList<>();
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++)
			arr.add(sc.nextLine().toCharArray());
		for (int i = 0; i < N; i++)
			Arrays.sort(arr.get(i));
		int output = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1 ; j < N; j++) {
				if (Arrays.toString(arr.get(i)).equals(Arrays.toString(arr.get(j)))) {
					output++;
				}
			}
			
		}

		System.out.println(output);
	}

}
