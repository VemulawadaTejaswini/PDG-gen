import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int A, B, C;
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();

	int ans = -1 * (A - B - C);
	if (ans > 0)
	    System.out.println(ans);
	else
	    System.out.println(0);
    }
}