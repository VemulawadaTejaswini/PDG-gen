import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nn = String.valueOf(n);
		int[] nnn = new int[3];
		for (int i = 0; i <= 2; i++) {
			if (nn.charAt(i) == '1') {
				nnn[i] = 9;
			} else {
				nnn[i] = 1;
			}
		}
		for (int i = 0; i <= 2; i++) {
			System.out.print(nnn[i]);
		}
	}
}
