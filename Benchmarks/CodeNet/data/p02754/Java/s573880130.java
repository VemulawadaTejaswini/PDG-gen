import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long rest = N % (A + B);
		long divide = Math.floorDiv(N, A + B);
		
		if(rest < A) {
			System.out.print(A * divide + rest);
		}else {
			System.out.print(A * divide + A);
		}
		sc.close();
	}
	
}