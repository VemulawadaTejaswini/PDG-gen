import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H=sc.nextLong();
		long W=sc.nextLong();
		long ans=H/2*W;
		if(H*W%2==1) {
			System.out.println(ans+1);
		}else {
			System.out.println(ans);
		}
	}
}
