import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long a[] = new long[n];

		for(int i=0;i<n;i++) {
			a[i]=scan.nextLong();
		}
		scan.close();
		long point =0;
		long cnt=0;
		long check=1;
		for(int i=0;i<n;i++) {
			if(check==a[i]) {
				cnt+=i-point;
				point=i+1;
				check+=1;
			}
		}

		if(check==1)System.out.println("-1");
		else System.out.println(cnt);
	}
}