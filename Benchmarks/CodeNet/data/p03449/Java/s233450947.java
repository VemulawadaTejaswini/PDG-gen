import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[][]=new int[2][n];
		int sum1=0,sum2=0;
		for(int i =0;i<n;i++) {
			a[0][i]=scan.nextInt();
			sum1+=a[0][i];
		}
		for(int i =0;i<n;i++) {
			a[1][i]=scan.nextInt();
			sum2+=a[1][i];
		}
		scan.close();
		int ans = 0;
		int check = 0;
		for(int i =0;i<n;i++) {
			ans += a[check][i];
			sum1-=a[0][i];
			if(check==0) {
				if(sum1 <= sum2) {
					check=1;
					ans += a[check][i];
				}
			}
			sum2-=a[1][i];
		}
		System.out.println(ans);
	}

}