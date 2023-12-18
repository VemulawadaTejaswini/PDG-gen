import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int A, B;
	A = sc.nextInt();
	B = sc.nextInt();

	int count = A - B * 2;
	if (count > 0)
	    System.out.println(count);
	else
	    System.out.println(0);
    }
}