import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int count = 0;

		for (count = 1; ;count++) {


			sum += count;
			if (n - sum <= 0){
				break;
			}
		}


//		if (n - sum == 0) {
//			for (int i = 1; i <= count; i++) {
//				System.out.println(i);
//			}
//			System.exit(0);
//		}

		int tmp = 0;
		for (int i = count; i >= 1;i--) {
			if (tmp + i > n) {
				continue;
			}

			tmp += i;

			System.out.println(i);
		}





		sc.close();
	}


}
