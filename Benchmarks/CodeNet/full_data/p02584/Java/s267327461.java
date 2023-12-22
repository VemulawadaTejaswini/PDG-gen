import java.util.*;
public class Main {
	public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    long X_start;
    long K_times;
    long D_reach;
    long x;
    long time;
    long result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        X_start = sc.nextLong();
        K_times = sc.nextLong();
        D_reach = sc.nextLong();

        x = X_start;
        time = 0;
    }

    private void solve() {
        approach();
        if (time == K_times) {
            return;
        }
        if (K_times-time % 2 == 0) {
            return;
        } else {
            if (x < 0) {
                x = x + D_reach;
            } else {
                x = x - D_reach;
            }
        }
    }

    private void approach() {
        long range = x < 0 ? -x : x;
        long t_approaching = range / D_reach;
        if (K_times < t_approaching) {
            time = K_times;
            if (x < 0) {
                x = x + D_reach*K_times;
            } else {
                x = x - D_reach*K_times;
            }
        } else {
            time = t_approaching;
            if (x < 0) {
                x = x + D_reach*t_approaching;
            } else {
                x = x - D_reach*t_approaching;
            }
        }
    }

    private void output() {
        if (x < 0) {
            System.out.println(-x);
        } else {
            System.out.println(x);
        }
    }
}
