import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		int x = 0;
		int max = 0;
		for(int i = 0;i < N;++i) {
			if(S.charAt(i) == 'I') {
				++x;
				if(x > max)
					max = x;
			} else {
				--x;
			}
		}
		System.out.println(max);
	}
}
