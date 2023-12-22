import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[45];
		num[0] = 1;
		num[1] = 1;
		for(int i = 2; i <= n ; i++) {
				num[i] = num[i -1] + num[i -2];
		}
		int a = num[n];
		System.out.println(a);
	}
}
