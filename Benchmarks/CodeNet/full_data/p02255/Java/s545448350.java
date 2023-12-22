import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
				if(j==0) {
				System.out.print(a[j]);
				}
				else {
					System.out.print(" "+a[j]);
				}
			}
		System.out.println();
		for(int i=1;i<n;i++) {
			int q=a[i];
			for(int j=i-1;j>=0;j--) {
				if(q<a[j]) {
					a[j+1]=a[j];
				}
				else {
					a[j+1]=q;
					break;
				}
				if(j==0) {
					a[0]=q;
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0) {
				System.out.print(a[j]);
				}
				else {
					System.out.print(" "+a[j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

