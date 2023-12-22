import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong(),B=sc.nextLong(),C=sc.nextLong(),K=sc.nextLong();
		long ans=0;
		if(K<=A) {
			ans= K;
		}else if(K>A&&K<=A+B) {
			ans= A;
		}else {
			ans=A-(K-A-B);
		}
		System.out.println(ans);
	}

}
