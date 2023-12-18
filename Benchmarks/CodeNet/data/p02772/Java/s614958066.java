import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		for(int i=0;i<n;i++) {
			a = sc.nextInt();
			if(a%2 != 0) {
				continue;
			}
			if(a%3!=0 && a%5!=0) {
				System.out.println("DENIED");
				return;
			}
		}
		System.out.println("APPROVED");
	}

}
