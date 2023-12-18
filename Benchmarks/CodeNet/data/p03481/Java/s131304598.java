import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X,Y;
		X= sc.nextLong();
		Y=sc.nextLong();
		long a=X;
		int i=1;
		for (;;i++) {
			a=a*2;
			if (a<0||a>Y) {
				break;
			}
		}
		System.out.println(i);
	}
}