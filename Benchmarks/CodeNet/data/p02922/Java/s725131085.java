import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int A,B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		if (B<=A) {
			System.out.println(1);
			return;
		}
		int now = A;
		for (int i=1;i<20;i++) {
			now +=A-1;
			if (now >=B) {
				System.out.println(i+1);
				return;
			}
		}
	}
}
