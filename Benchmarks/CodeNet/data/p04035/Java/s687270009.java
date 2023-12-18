import java.util.*;

public class Main {
	static int[] a;
	static int l;
	static ArrayList<Integer> ans= new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		l = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		if(solve(0, n-1) == -1) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possible");
			for(int i = 0; i < ans.size(); i++) {
				System.out.println(ans.get(i));
			}
		}
		
		return;
	}
	
	static int solve(int left, int right) {
		if(left == right) return 0;
		
		int length = 0;
		for(int i = left; i <= right; i++) {
			length += a[i];
		}
		if(length < l) return -1;
		
		for(int i = left; i < right; i++) {
			if(a[i] + a[i+1] < l) {
				ans.add(i+1);
				if(solve(left, i) == -1) return -1;
				if(solve(i+1, right) == -1) return -1;
				return 0;
			}
		}
		for(int i = left; i < right; i++) {
			ans.add(i+1);
		}
		return 0;
		
	}
	
}