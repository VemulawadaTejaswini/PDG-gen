import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	long a, b, lcm, gcd;
	String[] input;
	while (scan.hasNext()){
	    input = scan.nextLine().split(" ");
	    a = Integer.parseInt(input[0]);
	    b = Integer.parseInt(input[1]);
	    gcd = solveGCD(a, b);
	    lcm = a * b / gcd;
	    System.out.println(gcd + " " + lcm);
	}
    }
    static long solveGCD (long a, long b) {
	long gcd = a % b;
	if (gcd == 0) {
	    return b;
	}
	return solveGCD(b, gcd);
    }
}