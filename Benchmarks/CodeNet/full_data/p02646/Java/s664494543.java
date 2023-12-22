import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();
		int absD = Math.abs(B-A);
		int min = V-W;
		if (V <= W) {
			System.out.println("NO");
		} else {
			if (absD/min < T) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}