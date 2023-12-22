import java.util.Scanner;

public class Main {
	public static void countingsort(int[] a,int[] b,int k,int n) {
		int i,j;
		int[] c=new int[k+1];
		for(i=0;i<=k;i++) {
			c[i]=0;
		}
		for(j=1;j<=n;j++) {
			c[a[j]]++;
		}
		for(i=1;i<=k;i++) {
			c[i]=c[i]+c[i-1];
		}
		for(j=1;j<=n;j++) {
			b[c[a[j]]]=a[j];
			c[a[j]]--;
		}
		for(i=1;i<=n;i++) {
			if(i<n) {
				System.out.print(b[i]+" ");
			}
			else {
				System.out.println(b[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i ,n,k=10000;
		n=scan.nextInt();
		int[] a=new int[n+1];
		int[] b=new int[n+1];
		for(i=1;i<=n;i++) {
			a[i]=scan.nextInt();
		}
		countingsort(a,b,k,n);
		scan.close();
	}
}
