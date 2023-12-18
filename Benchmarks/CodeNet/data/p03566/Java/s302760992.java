import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    void solve() {
		int n = in.nextInt();
		int[] t = new int[n], v = new int[n];
		for(int i = 0; i < n; i++) t[i] = in.nextInt();
		for(int i = 0; i < n; i++) v[i] = in.nextInt();
		double ans = 0;
		double before = 0, next = n > 1 ? v[1] : 0;
		for(int i = 0; i < n; i++){
			double max = v[i];
			double up = Math.max(v[i] - before, 0);
			double down = Math.max(v[i] - next, 0);
			if(t[i] < up + down){
				double diff = (up + down - t[i]) /2.0;
				up -= diff;
				down -= diff;
				max -= diff;
			}
			double mid = t[i] - up - down;

			//System.out.println(up + " " + mid + " " + down + " : " + before + " " + next + " : " + max);

			ans += (Math.min(before, v[i]) + max) * up / 2.0;
			ans += mid * v[i];
			ans += (max + Math.min(next, v[i])) * down / 2.0;
			before = before + up - down;
			if(i == n - 2){
				next = 0;
			}else if (i < n - 3){
				next = v[i + 2];
			}
		}
		System.out.println(ans);
	}
	
    public static void main(String[] args) {
		new Main().solve();
    }
}
