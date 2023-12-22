import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		long money = a.nextLong();
		long b = 100;
		int num = 0;
		for(long i = b; i <= money; i++) {
			long risi = b / 100;
			b = b + risi;
			i = b;
			num++;

		}
		System.out.println(num);
		
	}
}