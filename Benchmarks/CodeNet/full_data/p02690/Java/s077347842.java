import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		long a = 0;
		long b = 0;
		
		for(int i=0;i<=1000;i++) {
			for(int k=0;k<5;k++) {
				a *= a;
			}
			for(int j=-1000;j<=1000;j++) {
				for(int l = 0;l<5;l++) {
					b *= b;
				}
				if(a - b == x) {
					System.out.println(a+" "+b);
					return;
				}
			}
		}

	}

}