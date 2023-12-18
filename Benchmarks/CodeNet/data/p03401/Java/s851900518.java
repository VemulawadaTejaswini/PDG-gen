import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n+2];
		a[0]=0;
		for(int i=1;i<n+1;i++) {
			a[i]=sc.nextInt();
		}
		a[n+1]=0;
		kk(a,n);
	}
	public static void kk(int[] a,int n) {
		for(int i=1;i<n+1;i++) {
			int num=0;
			for(int j=1;j<n+2;j++) {
				int sum=0;
				if(j==i) {
					sum=a[i-1]-a[i+1];
					j++;
				}else {
					sum=a[j-1]-a[j];
				}
				num+=Math.abs(sum);
			}
			System.out.println(num);
		}
	}
}
