
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int Atotal = 0;
		for(int i=0; i<N; i++) {
			Atotal += sc.nextInt();
		}
			if(Atotal >= H) {
				System.out.println("Yes");
			}else {
				System.out.println("No");

		}
	}

}
