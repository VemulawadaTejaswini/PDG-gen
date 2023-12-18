import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		long money = scan.nextLong();
		long year = 0;
		for(long num = 100;num < money;num = (int)((float)num * 1.01F)) {
			year ++;
		}
		System.out.println(year);

		scan.close();
	}
}