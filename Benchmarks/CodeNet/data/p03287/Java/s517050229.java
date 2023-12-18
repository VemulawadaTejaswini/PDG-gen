import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=scan.nextInt();
		}
		long sum=0;
		int count=0;
		for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				for(int k=i;k<=j;k++) {
					sum+=a[k];
				}
				if(sum%M==0) {
					count++;
				}
				sum=0;
			}
		}
		System.out.println(count);
	}
}
