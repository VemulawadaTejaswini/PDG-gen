import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N > 999)
			System.out.println(String.format("ABD%03d", N-999));
		else
			System.out.println(String.format("ABC%03d", N));
	}
}
