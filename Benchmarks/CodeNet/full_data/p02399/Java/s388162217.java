import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int x =scanner.nextInt();
		int y =scanner.nextInt();
		
		int d=x/y;
		int r=x%y;
		double f=(double)x/(double)y;
		
		System.out.printf("%d %d %05f", d, r, f);
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}