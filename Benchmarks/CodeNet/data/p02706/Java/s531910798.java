import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i = 0; i < m; i++) n -= in.nextInt();
		System.out.println(Math.max(0, n));
	}
} 
