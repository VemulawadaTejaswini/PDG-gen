import java.util.Scanner;


public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int base = sc.nextInt();

		long cube = (long)base*base*base;
		System.out.println(cube);

		sc.close();
	}

}