import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int preA = 0;
		int countA = 0;
		int n = 0;


		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(preA == a) {
				countA++;
			} else {
				if(countA > 0) {
					n += Math.ceil((double)countA/2);
				}
				countA = 0;
			}
			preA = a;
		}

		if(countA > 0) {
			n += Math.ceil((double)countA/2);
		}

		System.out.println(n);

		return;
	}

}
