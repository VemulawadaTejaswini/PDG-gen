import java.util.Scanner;

public class Main {
	//2-100
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int t = in.nextInt();
		int s = in.nextInt();
		
		if (t>=d/s) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	

}