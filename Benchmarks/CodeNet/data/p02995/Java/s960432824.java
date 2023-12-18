import java.util.Scanner;

class LCM {
    static long lcm(int a, int b){
        return (long)a * b / gcd(a, b);
    }

    private static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		System.out.println(antiDivision(b, c, d) - antiDivision(a-1, c, d));
	}

	static long antiDivision(long n, int c, int d){
		return n - (division(n, c) + division(n, d) - division(n, LCM.lcm(c, d)));
	}

	static long division(long n, long d){
		return n / d;
	}
}
