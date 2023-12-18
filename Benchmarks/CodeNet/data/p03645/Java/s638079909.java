import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for(int i = 0 ; i < m ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		List<Integer> startList = new ArrayList<>();
		List<Integer> endList = new ArrayList<>();
		for(int i = 0 ; i < m ; i++) {
			if(a[i] == 1) endList.add(b[i]);
			if(b[i] == n) startList.add(a[i]);
		}
		for(int e : endList) {
			for(int s : startList) {
				if(e == s) {
					System.out.println("POSSIBLE");
					return;
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
