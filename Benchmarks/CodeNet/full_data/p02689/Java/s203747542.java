import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int a,b;
		for(int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			set.add(h[a-1]<h[b-1]?(a-1):(b-1));
		}
		System.out.println(n-set.size());
	}
