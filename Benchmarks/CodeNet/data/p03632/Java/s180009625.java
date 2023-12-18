import java.util.Scanner;

public class Main {
	static long N;
	static long ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int L=sc.nextInt();
		int M=sc.nextInt();
		int ans=0;
		for(int i=0;i<101;i++) {
			if(N<=i&&K>=i&&L<=i&&M>=i)System.out.println(i);
		}
		if(ans>0)System.out.println(ans-1);
		else System.out.println(ans);
	}
}