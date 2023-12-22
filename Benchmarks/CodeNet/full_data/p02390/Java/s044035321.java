import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int s = sc.nextInt();
			if(s >=0 && s <86400) {
				int second = s % 60;
				s = s / 60;
				int minute = s % 60;
				int hour = s / 60;
				System.out.println(String.format("%02d:%02d:%02d",hour,minute,second));			
			}
		}
	}
}