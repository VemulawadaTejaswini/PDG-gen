import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arrayA[] = new int[n];
		int arrayB[] = new int[n];
		int arrayC[] = new int[n];

		for (int i = 0; i < n; i++) {
			arrayA[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrayB[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrayC[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arrayA[i] >= arrayB[j])
					continue;
				for (int k = 0; k < n; k++) {
					if (arrayB[j] >= arrayC[k])
						continue;
					else
						count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
