
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int[] n = new int[4];
		n[0] = 0;
		n[1] = 0;
		n[2] = 0;
		n[3] = 0;
		String StringLine = sc.nextLine();
		StringLine=StringLine.replace(" ", "");
		char[] array = StringLine.toCharArray();
		for (int i = 0; i < num; i++) {
			System.out.println(array[i]);
			switch (array[i]) {
			case 'P':
				n[0]++;
				break;
			case 'W':
				n[1]++;
				break;
			case 'G':
				n[2]++;
				break;
			case 'Y':
				n[3]++;
				break;
			}
		}
		int rc = 0;
		for (int i = 0; i < 4; i++) {
			if (n[i] == 0) {
				rc++;
			}
		}

		switch (rc) {
		case 0:
			System.out.println("Four");
			break;
		case 1:
			System.out.println("Three");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("One");
			break;
		}
	}

}
