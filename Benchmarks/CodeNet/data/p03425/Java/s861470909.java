import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] names = new int[5];
		for (int i = 0; i < n; i++) {
			int index = nameIndex(sc.next());
			if (index != -1)
				names[index]++;
		}
		
		long count = 0;
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				for (int k = j + 1; k < names.length; k++) {
					count += names[i] * names[j] * names[k];
				}
			}
		}
		System.out.println(count);
	}

	static int nameIndex(String str) {
		switch (str.charAt(0)) {
		case 'M':
			return 0;
		case 'A':
			return 1;
		case 'R':
			return 2;
		case 'C':
			return 3;
		case 'H':
			return 4;
		default:
			return -1;
		}
	}
}