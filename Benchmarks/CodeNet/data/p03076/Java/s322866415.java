import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Holder[] holders = new Holder[5];
        for (int i = 0; i < 5; i++) {
            holders[i] = new Holder(scan.nextInt());
        }
        int answer = 0;
        Arrays.sort(holders, new HolderComparator());
        for (int i = 0; i < 4; i++) {
            answer += Math.ceil((double) holders[i].need_time / 10) * 10;
        }
        answer += holders[4].need_time;
        System.out.println(answer);
    }
    class Holder {
        int need_time = 0;
        int loss_time = 0;
        Holder(int x) {
            this.need_time = x;
            if (x % 10 != 0) {
                this.loss_time = 10 - x % 10;
            } else {
                this.loss_time = 0;
            }
        }
    }
    class HolderComparator implements Comparator<Holder> {
        @Override
        public int compare(Holder o1, Holder o2) {
            if (o1.loss_time != o2.loss_time) {
                return Integer.compare(o1.loss_time, o2.loss_time);
            } else {
                return Integer.compare(o1.need_time, o2.need_time);
            }
        }
    }
}
