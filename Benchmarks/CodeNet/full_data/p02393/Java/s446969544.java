import java.util.Scanner;
 class Main {
	public void so() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d ;
		boolean flg = true;
		while(flg == true) {
			if(a > b) {
				d = a;
				a = b;
				b = d;
			} else {
				if(b > c) {
					d = b;
					b = c;
					c = d;
				}
			}
			if(a < b) {
				if(b < c) {
					if(a < c) {
						flg = false;
					}
				}
			}
		}
		System.out.println(a + " " + b + " " + c);
	}
	public static void main(String[] args) {
		new Main().so();
	}
}