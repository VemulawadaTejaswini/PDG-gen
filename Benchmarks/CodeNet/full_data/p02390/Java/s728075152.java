import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int s = stdIn.nextInt();
		int h = s/60/60;
		s = s-(h*60*60);
		int m = s/60;
		s = s-(m*60);
		System.out.println(h+":"+m+":"+s);
	}
}