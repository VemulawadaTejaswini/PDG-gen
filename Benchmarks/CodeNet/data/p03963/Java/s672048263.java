import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		scan.close();
		int ans=k;
		for(int i=1;i<n;i++) {
			ans*=(k-1);
		}
		System.out.println(ans);
	}
}
