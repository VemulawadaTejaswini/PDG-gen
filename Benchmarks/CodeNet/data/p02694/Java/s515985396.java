import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		int year = 0;
		long mnt = 100;

		while (mnt < X){
			year ++;
			mnt = (long) (mnt * 1.01);
		}

		System.out.println(year);

	}

}
