import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int D = stdIn.nextInt();
		int E = stdIn.nextInt();
		int F = stdIn.nextInt();
		
		double d = 0;
		double water = 0;
		double sugar = 0;
		double sum = 0;
		double sug = 0;
		for(int i = 0; 100*A*i <= F; i++) {
			for(int j = 0; 100*A*i+100*B*j <= F; j++) {
				for(int k = 0; 100*A*i+100*B*j+C*k <= F; k++) {
					for(int l = 0; 100*A*i+100*B*j+C*k+D*l <= F; l++) {
						water = 100*A*i+100*B*j;
						sugar = C*k+D*l;
						if((C*k+D*l) <= (A*i+B*j)*E && sugar/(water+sugar) > d) {
							d = sugar/(water+sugar);
							sum = water+sugar;
							sug = sugar;
						}
					}
				}
			}
		}
		System.out.println((int)sum+ " " + (int)sug);
	}

}