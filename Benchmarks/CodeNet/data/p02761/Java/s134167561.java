import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x[]= {-1,-1,-1};
		int check=0;
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
			if(x[i] ==-1) {
				x[i]=0;
			}
		}
		int ans = x[0]*100+x[1]*10+x[2];
		System.out.println((check==1 || ans==0)? "-1":ans);
	}
}