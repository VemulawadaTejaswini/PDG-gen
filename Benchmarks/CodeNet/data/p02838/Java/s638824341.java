import java.util.Scanner;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextLong();
		}
		long sum =0;
		for(int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				sum =(sum+(a[i]^a[j])%1000000007l)%1000000007l;
			}
		}
		System.out.println(sum);
	}
}
