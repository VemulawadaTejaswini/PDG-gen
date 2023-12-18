import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong(),B=sc.nextLong(),X=sc.nextLong();
		long a;
		if(X>=B) {
			a=B-1;
		}else {
			a=X;
		}
		long ans= (A*a)/B -A*(a/B);
		System.out.println(ans);
	}

}