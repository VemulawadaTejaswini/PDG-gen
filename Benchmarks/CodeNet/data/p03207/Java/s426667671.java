import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int p[]=new int[N];
		for(int i=0;i<N;i++) {
			p[i]=in.nextInt();
		}
		int max=0;
		for(int i=0;i<N;i++) {
			max=Math.max(p[i], max);
		}
		int sum=0;
		for(int i=0;i<N;i++) {
			sum=p[i]+sum;
		}
		System.out.println(sum-max/2);
	}
}
