import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int A10 = 10 * A + B + C;
		int B10 = 10 * B + A + C;
		int C10 = 10 * C + A + B;
		
		int AB10 = Math.max(A10, B10);
		int max = Math.max(AB10, C10);
		
		System.out.println(max);
		
	}
}