import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i;
			for(i=1;i<=n;i++) {
				int x=i;
				if(x%3 == 0) {
					System.out.printf(" "+i);
				}
				else {
				while(true) {
					if(x%10 == 3) {
						System.out.printf(" "+i);
					}
					x /= 10;
					if(x==0) break;
				}
				}
			}
			scan.close();
}
}

