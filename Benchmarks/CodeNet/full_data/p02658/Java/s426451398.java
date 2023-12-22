import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 1;
		long MAX = 1000000000000000000l;
		for (int i=0;i<N;i++) {
			long temp = sc.nextLong();
			if (temp==0) {
				System.out.println(0);
				return ;
			}
			temp *=sum;
			if (temp<sum||temp>MAX) {
				System.out.println(-1);
				return ;
			}
			sum = temp;
		}
		System.out.println(sum);
	}
}