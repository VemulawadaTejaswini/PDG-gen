import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float x[] = new float[4];
		float y[] = new float[4];

		for(int j=0; j<n; j++){
			for(int i=0; i<4; i++){
				x[i] = scan.nextFloat();
				y[i] = scan.nextFloat();
			}

			float d1 = (y[1]-y[0])/(x[1]-x[0]);
			float d2 = (y[3]-y[2])/(x[3]-x[2]);

			System.out.print(d1==d2 ? "YES" : "NO");

		}
	}
}