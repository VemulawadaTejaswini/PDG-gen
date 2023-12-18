import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		int k = 0;
		for(int i=1; i<=n; i++) {
			p = sc.nextInt();
			if(i != p) {
				k++;
			}
		}
		sc.close();
		if(k<=2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}