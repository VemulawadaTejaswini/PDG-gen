import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ga = sc.nextInt();
		int sa = sc.nextInt();
		int ba = sc.nextInt();
		int gb = sc.nextInt();
		int sb = sc.nextInt();
		int bb = sc.nextInt();
		int max = n;
		max = Math.max(max, change(n , ga, gb));
		max = Math.max(max, change(n , gb, ga));
		max = Math.max(max, change(n , sa, sb));
		max = Math.max(max, change(n , sb, sa));
		max = Math.max(max, change(n , ba, bb));
		max = Math.max(max, change(n , bb, ba));
		System.out.println(max);
	}
	
	static int change(int n, int a, int b) {
		int x = n / a;
		return n % a + x * b;
	}
}
