import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute11_1();
	}
	
	private static void execute11_1() {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long ans =0;
			if((b-a)%2!=0) {
				ans=Math.min(b-1,n-a);
			} else {
				ans = (b-a)/2;
			}
			
			System.out.println(ans);
		}
		
	}
}