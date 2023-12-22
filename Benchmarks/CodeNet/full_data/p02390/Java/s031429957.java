import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		scan.close();
		if(0 <= S && S < 86400)
		System.out.println(S/3600+":"+S%3600/60+":"+S%60);

	}

}