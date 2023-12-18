import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Nb1 = scan.next();
		int N = Integer.valueOf(Nb1);
		int[] nb = new int[N];

		for (int i = 0; i < N; i++) {
			String Nb = scan.next();
			nb[i] = Integer.valueOf(Nb);
		}
		int result=0;
		for(int i=0;i<N;i++) {
			result=result+nb[i];
		}
		result=result-N;
		System.out.println(result);

	}
}