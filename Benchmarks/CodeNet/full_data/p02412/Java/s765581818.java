import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();
		int count=0;
		 while(true) {
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=n-1;j++) {
				 if(i==j) continue;
				for(int h=3;h<=n-2;h++) {
					if(h==j || i == h || j==i) continue;
					if(x ==i+j+h )count ++;

				}
			}
		}

		System.out.println(count);
		n = scan.nextInt();
		x = scan.nextInt();
		if(n == 0 && x == 0) break;
		}
		scan.close();
	}

}

