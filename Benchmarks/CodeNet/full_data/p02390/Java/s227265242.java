import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		
		System.out.println( s/60/60 + ":"+ s/60%60 +":"+s%60);
		
	}

}

