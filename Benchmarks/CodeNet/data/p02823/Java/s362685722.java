import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long a = sc.nextLong();
		Long b = sc.nextLong();

		if((b-a)%2!=0) {
			if(b-1<=n-a) {
				System.out.println(b-1);
			}else{
				System.out.println(n-a);
			}
		}else {
			System.out.println((b-a)/2);
		}

	}

	public static int res(int n) {
		if(n==1) {
			return 1;
		}

		return n+res(n-1);
	}
}


