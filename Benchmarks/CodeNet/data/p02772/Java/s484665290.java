import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			if(temp%2==0) {
				if (temp%3!=0&&temp%5!=0) {
					System.out.println("DENIED");
					return ;
				}
			}
		}
		System.out.println("APPROVED");
	}
}