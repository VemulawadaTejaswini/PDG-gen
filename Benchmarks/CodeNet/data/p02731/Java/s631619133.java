
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double l = Integer.parseInt(sc.next());
		l =  l / 3;
		
		double ans = Math.pow(l, 3);
		
		System.out.println(ans);
		

	}

}
