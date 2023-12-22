import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int D = stdin.nextInt();
		int L = stdin.nextInt();
		
		int syou = D / L;
		int amari = D % L;
		
		System.out.println(syou + amari);
		
	}

}