import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = N / 100 + N % 100 / 10 + N % 10;

		System.out.println(ans);
		reader.close();
	}


}



