import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int line = sc.nextInt();
    	int line2 = sc.nextInt();
    	int gcd = getGCD(line2, line);
      System.out.print(gcd);
	}

	private static int getGCD(int m, int n) {
		return n == 0 ? m : getGCD(n, m % n);
	}
}