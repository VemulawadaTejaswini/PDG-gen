import java.util.Scanner;
class Main {
	int x,n = 0,a,b,c;
	public void pr() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n >= 3 && n <= 10000) {
			for(x = 3; x <= n;x++) {
				a = x % 3;
				b = x % 10;
				c = x /10;
				if(a == 0 || b == 3 || x / 10 == 3 || c % 10 == 3) {
					System.out.print(" " + x);
				}
			}
		}
	}
	public static void main(String[] args) {
		new Main().pr();
	}
}