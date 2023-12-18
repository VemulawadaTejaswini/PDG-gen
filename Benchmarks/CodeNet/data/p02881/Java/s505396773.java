import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n= scan.nextLong();
		scan.close();
		long min = Integer.MAX_VALUE;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i*j > n)break;
				if(i*j == n ) {
					if(min > i+j-2) min = i+j-2;
					break;
				}
			}
		}
		System.out.println(min);
	}

}