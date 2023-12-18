import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),sum=0,smin=99999,min=9999,max=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			max=Math.max(max, a[i]);
			min=Math.min(min, a[i]);
		}
		for(int i=min;i<=max;i++) {
			for(int j=0;j<n;j++) {
				sum+=(a[j]-i)*(a[j]-i);
			}
			smin=Math.min(sum, smin);
			//System.out.println(smin);
			sum=0;
		}
		System.out.println(smin);
	}
}