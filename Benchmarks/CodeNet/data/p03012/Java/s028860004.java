import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int[] s1 = new int[n];

		for (int i = 0; i < s1.length; i++) {
			sum += sc.nextInt();
			s1[i] = sum;
		}

		int minSub = sum;
		for (int t = 0; t < s1.length; t++) {
			int sub = Math.abs(sum - s1[t] * 2);
			if (sub < minSub)
				minSub = sub;
		}

		System.out.println(minSub);

		sc.close();
	}
}
