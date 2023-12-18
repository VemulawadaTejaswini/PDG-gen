import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[200000];
		int ans=0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[a[i]]++;
		}
		for(int i=0;i<n;i++) {
			--b[a[i]];

			for(int m=0;m<n;m++) {
				ans+=(b[m])*(b[m]-1)/2;
			}
			System.out.println(ans);
			ans=0;
			b[a[i]]++;
		}
	}
}
