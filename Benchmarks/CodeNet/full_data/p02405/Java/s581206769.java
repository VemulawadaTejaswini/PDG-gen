import java.util.Scanner;
class Main {
	int H = 0,W = 0,i,j,a,b;
	public void ch() {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		for(i = 1; i <= H;i++) {
			for(j = 1; j <= W;j++) {
				a = i % 2;
				b = j % 2;
				if(b == 1) {
					if(a == 1) {
					System.out.print("#");
					} else {
						System.out.print(".");
					}
				} else if(a == 0) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Main().ch();
	}
}