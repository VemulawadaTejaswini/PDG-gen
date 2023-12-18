import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		long count = 0;
		for (int i = 0; i <= N/R; i++) {
			for (int j = 0; j <= (N-i*R)/G; j++) {
				int result = N-i*R-j*G;
				if (result%B == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}