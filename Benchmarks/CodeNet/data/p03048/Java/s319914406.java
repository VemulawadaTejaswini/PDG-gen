
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int result = 0;

		for (int i=0; i <= (N/R); i++) {
			for (int j=0; j <= (N/G); j++) {
				for (int k=0; k <= (N/B); k++) {
					if ((R*i) + (j*G) + (k*B) == N) {
						result++;
					}
				}
			}
		}

		System.out.println(result);
	}
}