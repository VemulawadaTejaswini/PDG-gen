import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int D = in.nextInt();
		int T = in.nextInt();
		int S = in.nextInt();
		
		if(D / S >= T) {
			System.out.println("NO");
		}else {
			System.out.println("Yes");
		}
	}
}
