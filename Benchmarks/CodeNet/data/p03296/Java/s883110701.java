import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[] a = new int[N];
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			HashSet<Integer> set = new HashSet<Integer>();
			for(int r = 0; r < N; r++) {
				int l = r;
				while(r + 1 < N && a[r + 1] == a[r]) r++;
				set.add(r - l + 1);
			}
			int ans = 0;
			for(int s : set) {
				ans += (s != 1) ? s / 2 : 0;
			}
			System.out.println(ans);
		}
	}
}