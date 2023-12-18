import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int P=sc.nextInt();

		int x=A*3+P;

		System.out.println((int)Math.floor((double)(x/2)));

		sc.close();

	}

}
