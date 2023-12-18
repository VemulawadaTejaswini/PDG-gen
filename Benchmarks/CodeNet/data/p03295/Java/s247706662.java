import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.do_main();
    }
    public void do_main() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        Complain[] complains = new Complain[M];
        for (int i = 0; i < M; i++) {
            Complain b = new Complain();
            b.from = scan.nextInt()-1;
            b.to = scan.nextInt()-1;
            complains[i] = b;
        }
        int answer = solve(M, complains);
        System.out.println(answer);
    }

    public int solve(int M, Complain[] complains) {
        Arrays.sort(complains, new ToComplainComparator());
        int answer = 0;
        int pos = 0;
        for (int i = 0; i < M; i++) {
            Complain c = complains[i];
            if (pos <= c.from) {
                answer += 1;
                pos = c.to;
            }
        }
        return answer;
    }
    class Complain {
        int from = 0;
        int to = 0;
    }
    class ToComplainComparator implements Comparator<Complain> {
        @Override
        public int compare(Complain o1, Complain o2) {
            int result = Integer.compare(o1.to, o2.to);
            if (result != 0) {
                return result;
            }
            int distance_1 = o1.to - o1.from;
            int distance_2 = o2.to - o2.from;
            return Integer.compare(distance_1, distance_2);
        }
    }
}
