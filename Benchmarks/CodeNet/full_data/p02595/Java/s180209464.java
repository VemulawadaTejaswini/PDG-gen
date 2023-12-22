import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt(), D = sc.nextInt(), c = 0;
 
		for(int i = 0; i < N; i++) {
			long X = sc.nextInt(), Y = sc.nextInt();
			if(Math.sqrt(X * X + Y * Y) <= D) {
				c++;
			}
		}
		System.out.println(c);
	}
}