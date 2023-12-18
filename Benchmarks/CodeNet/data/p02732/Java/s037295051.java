import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n+1];
		int[] c=new int[n+1];
		long sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[a[i]]++;
		}
		for(int j=1;j<=n;j++) {
			c[j]=Math.max(0, b[j]*(b[j]-1)/2);
			sum+=c[j];
		}
		for(int i=0;i<n;i++) {
			System.out.println(sum-(b[a[i]]-1));
		}
	}
}
