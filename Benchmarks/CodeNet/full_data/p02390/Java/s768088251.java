import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int h = num / 3600;
			int m = (num%3600)/60;
			int s = (num%3600)%60;
			System.out.println(h + ":" + m + ":" + s);
	}
}