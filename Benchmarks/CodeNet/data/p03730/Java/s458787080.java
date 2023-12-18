import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		
		for(int i = 0; i < (int)1e8; i++) {
			if((b*i+c)/a == (b*i+c)/(double)a) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
	}

}
