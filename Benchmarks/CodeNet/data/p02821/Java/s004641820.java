import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		long m= scan.nextLong();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();

		Arrays.sort(a);
		long sum = 0;
		long cnt=0;
		int check=0;
		for(int i=n-1;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				if(i==j) {
					sum+=a[i]+a[j];
					cnt++;
				}else {
					sum+=a[i]+a[j];
					cnt++;
					if(cnt==m) {
						check=1;
						break;
					}
					sum+=a[i]+a[j];
					cnt++;
				}
				if(cnt==m) {
					check=1;
					break;
				}
			}
			if(check==1)break;
		}

		if(check==1)System.out.println(sum);
	}

}