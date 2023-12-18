import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int A = nextInt();
        int B = nextInt();

        int Answer = 1;

        int maxNum;
	        if (A == B) {
	        	maxNum = A;
	        } else {
	        if (A >= B) {
	        	maxNum = gcd(A, B);
	        } else {
	        	maxNum = gcd(B, A);
	        }
        }

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i<=maxNum; i++) {
        	if (maxNum % i == 0) {
        		list.add(i);
        	}
        }

        for (int test : list) {
        	if (isPrime(test)) {
        		Answer += 1;
        	}
        }

        println(Answer);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2)
        {
            if (num % i == 0)
            {
                // 素数ではない
                return false;
            }
        }

        // 素数である
        return true;
    }

    static int gcd (int a, int b) {
    	int temp;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return b;
    }
}
