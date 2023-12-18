import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long k = scan.nextLong();
		scan.close();
		if(k-a>0) {
			System.out.print("0 ");
			System.out.println((k-a-b>0)? k-a-b:"0");
		}
		else System.out.println(a-k+" "+ b);

	}

}