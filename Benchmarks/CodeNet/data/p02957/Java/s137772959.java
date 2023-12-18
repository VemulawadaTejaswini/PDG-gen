import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int k=0;
		int f = 0;
		for(int i=1; i<=1000000000; i++) {
			a -= i;
			b -= i;
			if(a+b==0) {
				k = i;
				f = 1;
				break;
			}
		}
		if(f == 1) {
			System.out.println(k);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}

}