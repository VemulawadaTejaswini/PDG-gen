import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		
		int sec = kbScanner.nextInt();
		
		int hour = 0, minute = 0, second = 0;
		
		hour = sec / 3600;
		sec -= hour * 3600;
		minute = sec / 60;
		sec -= minute * 60;
		second = sec;
		
		System.out.println(hour + ":" + minute + ":" + second);
	}
}