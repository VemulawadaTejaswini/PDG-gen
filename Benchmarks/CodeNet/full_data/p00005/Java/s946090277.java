import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		long a,b,ans,n,ax,bx;

		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();


			//最大公約数
			ans = 1;
			n = Math.min(a, b);

			for(long i = 1;i <= n;i++) {


				if(a % (n/i) == 0 && b % (n/i) == 0) {
					ans = n/i;
					break;
				}
			}

			//最小公倍数

			ax = bx = 1;

			while(true) {
				if(a * ax == b * bx) {
					break;
				}else if(a * ax > b * bx){
					bx++;
				}else if(a * ax < b * bx){
					ax++;
				}
			}
			System.out.println(ans + " " + a * ax);
		}

		scan.close();

	}

}
