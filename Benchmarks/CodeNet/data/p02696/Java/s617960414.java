import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	long a  = scanner.nextInt();
	long b  = scanner.nextLong();
	long n  = scanner.nextLong();
	if (b==1) System.out.println(0);
	else if (n>=b) {
		n%=b;
		System.out.println(a*n/b-a*(n/b));
	}
	else {
		System.out.println(a*n/b-a*(n/b));
	}
	scanner.close();}}