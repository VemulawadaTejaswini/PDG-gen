import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		int n,m,na,na2=0,s,cnt=0,flg=0;
		int a[]=new int[30];
		int i,j;
		int b=0;

		Arrays.fill(a,b);

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		m = sc.nextInt();

		if(n==1) flg=1;

		for(i=1;i<=n;i++) {

			na = sc.nextInt();

			if(flg==1) na2=na;

			for(j=1;j<=na;j++) {
				s = sc.nextInt();
				a[s]++;
			}
		}

		if(flg==0) {
			for(i=1;i<=n;i++) {
				if(a[i]==n) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

		else {
			System.out.println(na2);
		}

	}
}
