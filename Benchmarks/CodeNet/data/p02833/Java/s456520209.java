import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		if(n%2==1)System.out.println(0);
		else{
			long a=(n/10);
			long cnt=0;
			for(long i=a;i<n;i+=2) {
				//System.out.println(i);
				for(long j=1;j<n;j++) {
					if(Math.pow(5, j)<=n&&i%Math.pow(5,j)==0) {
						cnt+=1;
					}else break;
				}
			}
			System.out.println(cnt);
		}
	}
}
