import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[100000];
		for (int i=0;i<N;i++) {
			b[a[i]]++;
		}
		long sum=0;
		for (int i=0;i<b.length;i++) {
			sum += b[i]*(b[i]-1)/2;
		}
		for (int i=0;i<N;i++) {
			long temp=sum;
			temp-=b[a[i]]*(b[a[i]]-1)/2;
			temp+=(b[a[i]]-1)*(b[a[i]]-2)/2;
			System.out.println(temp);
		}
	}
}