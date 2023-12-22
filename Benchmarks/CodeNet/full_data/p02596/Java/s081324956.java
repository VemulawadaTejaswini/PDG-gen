import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		long base = 0;
		boolean fg=false;

		for(int i=0;i<n;i++) {
			base = (long) (base*Math.pow(10, i)+7);
			if(base%n == 0) {
				fg = true;
				System.out.println(i+1);
				break;
			}
		}
		if(!fg) {
			System.out.println(-1);
		}
	}
}