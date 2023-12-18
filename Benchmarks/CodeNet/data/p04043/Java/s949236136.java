import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		in.close();
		
		int five = 0;
		int seven = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				five++;
			} else if (arr[i] == 7) {
				seven++;
			}
		}

		if (five == 2 && seven == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
