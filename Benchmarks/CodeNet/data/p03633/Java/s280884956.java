import java.util.*;
public class Main {
	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
    }
    static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
    }  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextLong();
		for(int i = 0; i < N-1; i++){
			long S = sc.nextLong();
			T = lcm(T, S);
		}
		System.out.println(T);
	}
}