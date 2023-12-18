import java.util.Scanner;

public class A {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Nb1 = scan.next();
		int N = Integer.valueOf(Nb1);
		String Nb1 = scan.next();
		int M = Integer.valueOf(Nb2);
		int[] nb1 = new int[M];
		int[] nb2 = new int[M];

		for (int i = 0; i < M; i++) {
			nb1[i] = scan.nextInt();
			nb2[i] = scan.nextInt();
		}
		int count=0;
		for (int j = 0; j < N; j++) {
			int v1=nb1[j];
			int	v2=nb2[j];
			for (int i = j; i < N; i++) {
				if(nb2[i]<v1||v2<nb[i]) {
				count++;
				}
			}
		}

		System.out.println(count);

	}
}