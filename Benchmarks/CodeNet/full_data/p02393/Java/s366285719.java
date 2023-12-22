import java.util.Scanner;
 class Main {
	public void so() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b) {
			if(c < b) {
				if(a < c) {
					System.out.println(a + " " + c + " " + b);
				}else{
					System.out.println(c + " " + a + " " + b);
				}
			} else {
				System.out.println(a + " " + b + " " + c);
			}
		}
		if(b < a) {
			if(c < a) {
				if(c < b) {
					System.out.println(c + " " + b + " " + a);
				}else{
					System.out.println(b + " " + c + " " + a);
				}
			} else {
				System.out.println(b + " " + a + " " + c);
			}
		}
	}
	public static void main(String[] args) {
		new Main().so();
	}
}