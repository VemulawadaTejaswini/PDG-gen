import java.util.*;

class Main {

	static Scanner in = new Scanner(System.in);

    void solve() {
		int n = in.nextInt();
		int[] s = new int[n];
		for(int i = 0; i < n; i++) s[i] = in.nextInt();
		int q = in.nextInt();
		int[] t = new int[q];
		for(int i = 0; i < q; i++) t[i] = in.nextInt();
		int ans = 0;
		for(int i : t) if(serch(s, i) > -1) ans++;
		System.out.println(ans);
	}

	int serch(int[] a, int n){
		int left = 0;
		int right = a.length - 1;
		int mid = -1;
		while(left < right){
			mid = (left + right) / 2;
			if(a[mid] == n) return 1;
			else if(n > a[mid]) left = mid + 1;
			else right = mid;
		}
		return -1;
	}

    public static void main(String[] args) {
        new Main().solve();
    }
}