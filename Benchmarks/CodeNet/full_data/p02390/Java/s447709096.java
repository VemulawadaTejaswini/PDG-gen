import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		int hour = time/3600;
		int min = time%3600/60;
		int sec = time%3600%60;

		System.out.println(hour + ":" + min + ":" + sec);
	}
}