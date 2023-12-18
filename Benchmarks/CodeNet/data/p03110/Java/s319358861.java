import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double ans=0;
		for (int i=0; i<N; i++) {
			double num = sc.nextDouble();
			String type = sc.next();
			if(type.equals("BTC")) num*=380000.0;
			ans+=num;
		}
		System.out.println(ans);
	}
}
