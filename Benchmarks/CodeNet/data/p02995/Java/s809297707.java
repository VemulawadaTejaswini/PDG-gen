import java.util.Scanner;

class Main {

    public static long calc(long A, long B, long X) {
	long A_count = (A - 1) / X;
	long B_count = B / X;

	return B - A + 1 - (B_count - A_count);
    }

    public static long lcm(long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a % b) != 0) {
		a = b;
		b = temp;
	}

	return (long)(c / b);
    }
    
    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	long A, B, C, D;
	A = sc.nextLong();
	B = sc.nextLong();
	C = sc.nextLong();
	D = sc.nextLong();

	long C_count = calc(A, B, C);
	long D_count = calc(A, B, D);
	long CD_count = calc(A, B, lcm(C, D));

	System.out.println(C_count + D_count - CD_count);
    }
}