import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		scan.close();
		int sum=0;
		int check=0;
		for(int i=1;i<=n;i++) {
			sum+=l+i-1;
			if( 0 == l+i-1 )check=1;
		}
		System.out.println((check==1)? sum: sum-l);
	}

}