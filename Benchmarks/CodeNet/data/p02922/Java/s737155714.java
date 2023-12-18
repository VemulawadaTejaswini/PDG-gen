import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int A, B;
		A = reader.nextInt();
		B = reader.nextInt();
		int i=1;
		while((A*i)-(i-1) < B) {
			++i;
		}
		System.out.println(i);
		

	}

}
