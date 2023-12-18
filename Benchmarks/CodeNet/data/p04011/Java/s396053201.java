import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int count=0;
		for(int i=1;i<=n;i++) {
			if(i<=k) {
				count+=x;
			}else {
				count+=y;
			}
		}
		System.out.println(count);
	}

	public static int res(int n) {
		if(n==1) {
			return 1;
		}

		return n+res(n-1);
	}
}


