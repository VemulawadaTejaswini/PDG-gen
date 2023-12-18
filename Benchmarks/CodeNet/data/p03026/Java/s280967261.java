import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        int remain = N;
        boolean[] finished = new boolean[N];
        int[] point = new int[N];
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            a[i] = scan.nextInt() - 1;
            b[i] = scan.nextInt() - 1;
            if (!edges.containsKey(a[i])) {
                edges.put(a[i], new ArrayList<Integer>());
            }
            edges.get(a[i]).add(b[i]);
            if (!edges.containsKey(b[i])) {
                edges.put(b[i], new ArrayList<Integer>());
            }
            edges.get(b[i]).add(a[i]);
        }
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = scan.nextInt();
        }
        Arrays.sort(data);
        int M = 0;
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N - 1; i++) {
            M += data[i];
            p.add(data[i]);
        }
        p.add(data[N-1]);
        Queue<Integer> queue = new LinkedList<>();
        for(int x : edges.keySet()) {
            if (edges.get(x).size() > 1) {
                queue.add(x);
                break;
            }
        }
        while (0 < remain && !queue.isEmpty()) {
            int current = queue.poll();
            if (finished[current]) {
                continue;
            }
            finished[current] = true;
            point[current] = p.poll();
            remain -= 1;
            List<Integer> next = edges.get(current);
            for(int x : next) {
                queue.add(x);
            }
        }

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.toString(point[i]));
        }
        System.out.println(M);
        System.out.println(String.join(" ", list));
    }
}
