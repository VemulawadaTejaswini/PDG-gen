import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int x[]=new int[n];
		int check=0;
		for(int i=0;i<n;i++) {
			x[i] = -1;
		}
		for(int i=0;i<m;i++) {
			int num = scan.nextInt() -1;
			int num2 = scan.nextInt();
			if(x[num] == -1) x[num] = num2;

			if(x[num] != -1 && x[num] != num2  ) {
				check=1;
			}
		}
		scan.close();
		for(int i=0;i<n;i++) {
			if(i==0 &&x[0]==-1) {
				x[i]=0;
			}else if(x[i] ==-1) {
				x[i]=0;
			}
		}
		int ans=0;
		int z=1;
		for(int i=n-1;i>=0;i--) {
			ans += i*z;
			z*=10;
		}
		System.out.println((check==1 || ans==0)? "-1":ans);
	}
}