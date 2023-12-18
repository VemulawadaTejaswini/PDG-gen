import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


		if(c - a == b || a - c == b  ){

		System.out.println("YES");

		}else{


		System.out.println("NO");

	}
}}
