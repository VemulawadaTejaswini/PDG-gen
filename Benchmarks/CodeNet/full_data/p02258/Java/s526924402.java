import java.util.*;

class Main {

    void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			int r = in.nextInt();
			max = Math.max(max, r - min);
			min = Math.min(min, r);
		}
		System.out.println(max);
	}

    public static void main(String[] args) {
        new Main().solve();
    }
}