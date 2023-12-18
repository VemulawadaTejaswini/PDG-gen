import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t[]= new int[n];
		for(int i=0;i<n;i++) {
			t[i]=scan.nextInt();
		}
		int m= scan.nextInt();
		int p[]= new int[m];
		for(int i=0;i<m;i++) {
			p[i]=scan.nextInt();
		}
		scan.close();

		for(int i=0;i<m;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				if( i==j ) {
					if(p[i] < t[j]) {
						sum += p[i];
					}else {
						sum += t[i];
					}
				}else {
					sum += t[i];
				}
			}
			System.out.println(sum);
		}
	}
}