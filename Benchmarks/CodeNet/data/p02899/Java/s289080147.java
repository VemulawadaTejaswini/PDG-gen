import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				if(i==a[j]) {
					System.out.print(j+1);
					break;
				}
			}
			if(i!=n)System.out.print(" ");
		}
		System.out.println();

	}

}