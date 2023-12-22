import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, h, m, s;
		x = scan.nextInt();
		h = x/3600;
		m = x%3600/60;
		s = x%3600%60;
				// 
		
		System.out.println(h+":"+m+":"+s);
	}

}

