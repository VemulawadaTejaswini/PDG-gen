import java.util.Scanner;

public class Watch {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int hour = S/3600;
		int minit = (S - 3600 * hour )/60;
		int second = (S - 3600 * hour - 60 * minit )%60;


		System.out.print(hour + ":");
		System.out.print(minit + ":");
		System.out.print(second );

	}

}