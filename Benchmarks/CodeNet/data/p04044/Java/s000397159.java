import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.nextLine();
		String[] s = new String[N];
		for(int i = 0; i < N; i++) {
			s[i] = sc.nextLine();
		}
		sc.close();
		Arrays.sort(s);
		for(int i = 0; i < N; i++) {
			System.out.print(s[i]);
		}
		System.out.println("");
	}
}