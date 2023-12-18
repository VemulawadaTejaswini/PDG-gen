import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		for(;x>1;x--) {
			System.out.println(x);
			for(int i=2;i < x; i++) {
				int n = i*i;
				while(n <= x) {
					if(n==x) {
						System.out.println(x);
						return;
					}
					n *= n;
				}
			}
		}
		System.out.println(x);
	}
}
