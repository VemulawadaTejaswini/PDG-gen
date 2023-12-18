import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] am = new int[N + 1][N + 1];
        List<int[]> edges = new ArrayList<>();
        for (int i : IntStream.range(0, M).toArray()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            am[a][b] = 1;
            am[b][a] = 1;
            edges.add(new int[]{a, b});
        }
        int count = 0;
        for(int[] edge : edges) {
            int start = edge[0];
            int goal = edge[1];
            am[start][goal] = 0;
            am[goal][start] = 0;
            Set<Integer> toured = new HashSet<>();
            Set<Integer> next = new HashSet<>();
            Set<Integer> tmp = new HashSet<>();
            next.add(start);
            while (!next.isEmpty()) {
                toured.addAll(next);
                for(int nn: next) {
                    for (int i = 1; i <= N; i++) {
                        if(am[nn][i] == 0) {
                            continue;
                        }
                        if(toured.contains(i)) {
                            continue;
                        }
                        tmp.add(i);
                    }
                }
                if (toured.contains(goal)) {
                    count--;
                    break;
                }
                next = tmp;
                tmp = new HashSet<>();
            }
            count++;
            am[start][goal] = 1;
            am[goal][start] = 1;
        }

        System.out.println(count);
    }
}
