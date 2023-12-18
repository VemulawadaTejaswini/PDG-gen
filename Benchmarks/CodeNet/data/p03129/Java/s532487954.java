



import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		double K = sc.nextInt();
		double devide = N/2;
//		System.out.println(devide);
		if(devide%2==0) {
			if (devide > K) {
				System.out.println("YES");
			}else {
//				System.out.println("1");
				System.out.println("NO");
			}
		}else {
			if(devide+0.5 >= K) {
				System.out.println("YES");
			}else {
//				System.out.println("2");
				System.out.println("NO");
			}
		}


	}
}
