import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vec[] = new int[1000];
		int i = 1;
		while (true) {
			vec[i] = sc.nextInt();
			if (vec[i] == 0)
				break;
			System.out.printf("Case %d: %d\n", i, vec[i]);
			i++;
			
		}
		//i = 1;
		//while (vec[i] != 0) {
			//System.out.printf("Case %d: %d\n", i, vec[i]);
			//i++;
		//}
		// System.out.printf("ok %d %d", i, vec[i]);
	}

}