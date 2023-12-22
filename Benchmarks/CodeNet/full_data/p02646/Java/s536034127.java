import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		long absD = Math.abs(B-A);
		long min = V-W;
		if (V <= W) {
			System.out.println("NO");
		} else {
			if (absD/min <= T) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}