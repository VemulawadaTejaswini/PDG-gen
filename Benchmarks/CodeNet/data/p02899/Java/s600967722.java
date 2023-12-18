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
			for(int j=i-1;j<n;j++) {
				if(i==a[j]) {
					System.out.print(j+1);
					int tmp=a[j];
					a[j]=a[i-1];
					a[i-1]=tmp;
					break;
				}
			}
			if(i!=n)System.out.print(" ");
		}
		System.out.println();
	}

}