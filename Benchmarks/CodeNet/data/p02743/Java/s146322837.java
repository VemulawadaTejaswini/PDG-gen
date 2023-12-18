import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			long a = Integer.parseInt(sc.next());
			long b = Integer.parseInt(sc.next());
			long c = Integer.parseInt(sc.next());
			double A = lessThanSqrt(a);
			double B = lessThanSqrt(b);
			double C = lessThanSqrt(c);
			
			if(A+B<C) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}	
	}
    private static long lessThanSqrt (long a) {
        long b = longSqrt(a);
        if (b*b == a) {
            return b-1;
        } else {
            return b;
        }
    }

    private static long longSqrt (long a) {
        long b = (long)Math.sqrt(a);
        if(b*b > a) {
            b--;
        }
        return b;
    }
}