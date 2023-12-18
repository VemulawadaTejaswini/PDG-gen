import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N=Integer.parseInt(new Scanner(System.in).nextLine());
		int x=0;
		for(int i=1;i<=N-1;i++) {
			x+=i;
		}
		System.out.println(x);
	}
}