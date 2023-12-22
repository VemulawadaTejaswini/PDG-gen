import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		double at = (double) (Math.PI * h) /6;
		at -= (double)(Math.PI * w * 11 )/360;
		
		
		double ans = a*a + b*b - 2 * a *b * Math.cos(at);
		ans = Math.sqrt(ans);
		System.out.println(ans);
	
	}

}
