import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int ans = 0;
		if(b<c) {
			ans=0;
		}else {
			if(b<=d) {
				ans=(d-a)-((c-a)+(d-b));
			}else{
				ans=d-c;
			}
		}

		System.out.println(ans);

	}

}
