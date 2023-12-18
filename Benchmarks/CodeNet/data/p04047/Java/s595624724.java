import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n*2];
		int sum=0;
		for(int i=0;i<n*2;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n*2;i+=2) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
