import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i;
		int ans=1000000;
		while(true) {
			int n=sc.nextInt();
			if(n==0)
				break;
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			for(i=0;i<n-1;i++) {
				if(ans>a[i+1]-a[i])
					ans=a[i+1]-a[i];
			}
			System.out.println(ans);
			ans=1000000;
		}

	}
}

