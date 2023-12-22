import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		int hour = (a / 3600);
		int minute = (a % 3600) / 60;
		int second = a % 60;
		
		System.out.println(hour + ":" + minute + ":" + second);
	}
}