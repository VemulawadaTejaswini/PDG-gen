import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        HashMap<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) {
            graph.put(i, new HashSet<>());
        }

        for (int i = 0; i < Math.ceil(N / 2.0); i++) {
            String S = scan.next();
            char sChar[] = S.toCharArray();
            for (int j = 0; j < sChar.length; j++) {
                if (sChar[j] == '1') {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        int min = 1000;//N <= 200
        long answer = -1;
        for (int i = 0; i < graph.size(); i++) {

            answer = Math.max(answer, depth(i, graph, N));
        }
        os.println(answer);

    }

    private static long depth(int start, Map<Integer, Set<Integer>> graph, int N) {
        HashMap<Integer, Set<Integer>> tempGraph = new HashMap<>();
        for (int j = 0; j < N; j++) {
            tempGraph.put(j, new HashSet<>(graph.get(j)));
        }
        HashSet<Integer> firstGp = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        firstGp.add(start);

        long count = 0;
        while (!firstGp.isEmpty()) {
            count++;
            HashSet<Integer> secondGp = new HashSet<>();
            for (Integer pos : firstGp) {
                visited.add(pos);
                for (Integer childPos : tempGraph.get(pos)) {
                    if (visited.contains(childPos)) {
                        return -1;
                    }
                    secondGp.add(childPos);
                }
            }
            for (Integer deletePos : firstGp) {
                for (Integer pos : secondGp) {
                    tempGraph.get(pos).remove(deletePos);
                }
            }
            firstGp.clear();
            firstGp.addAll(secondGp);
        }
        return count;
    }
}