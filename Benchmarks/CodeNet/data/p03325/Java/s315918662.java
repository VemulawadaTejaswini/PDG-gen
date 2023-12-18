import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0,count=0;
		double[] a=new double[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			if(a[i]%2==0) {
				while(a[i]%2==0) {
					a[i]/=2;
					count++;
				}
				sum+=count;
				count=0;
			}
		}
		System.out.println(sum);
	}
}

