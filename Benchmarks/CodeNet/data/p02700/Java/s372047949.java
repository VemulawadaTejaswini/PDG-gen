import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
      
		do {
			if(a-d<=0) {
				System.out.print("No");
				return;
			}
			else if(c-b<=0) {
				System.out.print("Yes");
				return;
			}
			else {
				a -= d;
				c -= b;
			}
		}while(a != 0 && c != 0);
	}
}
