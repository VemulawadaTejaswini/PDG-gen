import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int d=scan.nextInt();
		int l=scan.nextInt();
		int n=(d/l)+(d%l);
		System.out.println(n);
	}
}

