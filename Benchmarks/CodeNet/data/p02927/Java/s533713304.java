import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	private void compute() {
		int M = scan.nextInt();
		int D = scan.nextInt();
		
		int cnt = 0;
		for (int i=0;i<=D;i++) {
			if (i / 10 >= 2 && i % 10 >= 2) {
				if ((i / 10) * (i % 10) <= M) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void main(String...arg) {
		new Main().compute();
	}

}
