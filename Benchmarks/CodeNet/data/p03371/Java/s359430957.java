import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C,X,Y;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();
		int min =A*X+B*Y;
		if (X>Y) {
			if (C*2*X<min) {
				min = C*2*X;
			}
			if (C*2*Y+(X-Y)*A<min) {
				min =C*2*Y+(X-Y)*A;
			}
		} else {
			if (C*2*Y<min) {
				min = C*2*Y;
			}
			if (C*2*X+(Y-X)*B<min) {
				min =C*2*X+(Y-X)*B;
			}
		}
		System.out.println(min);
	}
}