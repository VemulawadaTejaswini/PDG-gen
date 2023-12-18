import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		long money = scan.nextLong();
		long year = 0;
		for(long num = 100;num < money;num *= 1.01) {
			year += 1;
		}
		System.out.println(year);

		scan.close();
	}
}