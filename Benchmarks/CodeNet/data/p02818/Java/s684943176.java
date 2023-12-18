import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long takahashi = sc.nextLong();
		long aoki = sc.nextLong();
		long count = sc.nextLong();
		long takahashiHozon = takahashi;

		if(takahashi  >= count ) {
			takahashi -= count;
		}else {
			takahashi = 0;
			aoki -= (count -takahashiHozon);
			if(aoki < 0) {
				aoki = 0;
			}
		}

		System.out.println(takahashi + " " + aoki);

	}
}