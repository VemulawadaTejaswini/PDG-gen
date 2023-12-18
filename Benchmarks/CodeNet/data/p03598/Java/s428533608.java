import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		int ans=0;

		for(int i=0;i<N;i++) {
			int x=sc.nextInt();
			if(x<(K-x)) {
				ans+=2*x;
			}else {
				ans+=2*(K-x);
			}
		}
		System.out.println(ans);
	}
}