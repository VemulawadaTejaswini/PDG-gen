import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println(a+(int)Math.pow(a, 2)+(int)Math.pow(a, 3));
	}

}