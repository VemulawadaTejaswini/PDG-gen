import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double x1 = stdIn.nextInt();
		double y1 = stdIn.nextInt();
		double x2 = stdIn.nextInt();
		double y2 = stdIn.nextInt();
		
		double ans = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2) * (y1 - y2));
		
		System.out.println(ans);
	}
}