import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		// a + b + 2 sqrt(a * b) < c
		// 2 sqrt(a * b) < c - a - b
		boolean f = true;
		if(c - a - b < 0){
			f = false;
		}else{
			// 4 * a * b < d * d
			long d = c - a - b;
			if(4 * a * b < d * d){
				f = true;
			}else{
				f = false;
			}
		}
		if(f){
			System.out.println("Yes");			
		}else{
			System.out.println("No");						
		}
	}
}
