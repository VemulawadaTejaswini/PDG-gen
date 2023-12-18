import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 1;
		for(int i = 1; i <= n; i++) {
			s = (s * i)%1000000007;
		}
		System.out.println(s);
	}
}