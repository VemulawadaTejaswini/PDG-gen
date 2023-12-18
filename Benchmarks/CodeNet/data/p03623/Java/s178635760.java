import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),a=scan.nextInt(),b=scan.nextInt();
		if(Math.min(a, b)<x) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}

	}

}