import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		int g = M/N;
		
		while(g>0) {
			if(M%g == 0) {
				System.out.println(g);
				return;
			}
			g--;
		}
	}
}
