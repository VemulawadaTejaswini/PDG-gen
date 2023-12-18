import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		long K = sc.nextLong();
		
		System.out.println(K % 2 == 0 ? A - B : B - A);
	}
}
