import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		long ans = 0;
		
		if(Math.signum(b) == 1.0 && Math.signum(d) == 1.0) {
			ans = b * d;
			System.out.println((long)ans);
		}else if(Math.signum(b) <= 0 && Math.signum(d) <= 0){
			ans = a * c;
			System.out.println((long)ans);
		}else if(Math.signum(b) == -1.0 || Math.signum(d) == -1.0) {
			if(Math.signum(b) > Math.signum(d)) {
				ans = a * d;
			}else {
				ans = b * c;
			}
			System.out.println((long)ans);
		}else if(Math.signum(b) == 0 || Math.signum(d) == 0) {
			System.out.println(0);
		}

	}

}
