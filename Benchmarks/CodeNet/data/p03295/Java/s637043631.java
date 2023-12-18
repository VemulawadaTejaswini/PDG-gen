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
        int answer = solve(N, M, complains);
        System.out.println(answer);
    }

    public int solve(int N, int M, Complain[] complains) {
        Arrays.sort(complains, new FromComplainComparator());
        int[] group = new int[N];
        Arrays.fill(group, 0);
        int left_answer = 0;
        int left_index = -1;
        int right_index = -1;
        for (int i = 0; i < M; i++) {
            Complain c = complains[i];
            if (group[c.from] != group[c.to]) {
                continue;
            }
            right_index = c.to;
            int j = i + 1;
            for (; j < M; j++) {
                Complain a = complains[j];
                if (right_index <= a.from) {
                    break;
                }
                right_index = Math.min(right_index, a.to);
            }
            for (int k = right_index; k < N; k++) {
                if (group[k] != group[c.from]) {
                    break;
                }
                group[k] = right_index;
            }
            left_answer += 1;
        }
        Arrays.sort(complains, new ToComplainComparator());
        Arrays.fill(group, N-1);
        int right_answer = 0;
        for (int i = 0; i < M; i++) {
            Complain c = complains[i];
            if (group[c.from] != group[c.to]) {
                continue;
            }
            left_index = c.from;
            int j = i + 1;
            for (; j < M; j++) {
                Complain a = complains[j];
                if (a.to <= left_index) {
                    break;
                }
                left_index = Math.max(left_index, a.from);
            }
            for (int k = left_index; 0 <= k; k--) {
                if (group[k] != group[c.to]) {
                    break;
                }
                group[k] = left_index;
            }
            right_answer += 1;
        }
        return Math.min(left_answer, right_answer);
    }

    class Complain {
        int from = 0;
        int to = 0;
    }
    class FromComplainComparator implements Comparator<Complain> {
        @Override
        public int compare(Complain o1, Complain o2) {
            int result = Integer.compare(o1.from, o2.from);
            if (result != 0) {
                return result;
            }
            int distance_1 = o1.to - o1.from;
            int distance_2 = o2.to - o2.from;
            return Integer.compare(distance_1, distance_2);
        }
    }
    class ToComplainComparator implements Comparator<Complain> {
        @Override
        public int compare(Complain o1, Complain o2) {
            int result = Integer.compare(o1.to, o2.to);
            if (result != 0) {
                return -result;
            }
            int distance_1 = o1.to - o1.from;
            int distance_2 = o2.to - o2.from;
            return Integer.compare(distance_1, distance_2);
        }
    }
}
