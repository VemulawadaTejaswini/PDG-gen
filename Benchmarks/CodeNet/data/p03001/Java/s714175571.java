import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double s = w * y / 2.0;
		System.out.print(s);
		
		if (x*2==w&&y*2==h) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
				
		sc.close();
	}

}