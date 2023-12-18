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
        for (int i = 0 ; i < N ; i++) {
            graph.put(i, new HashSet<>());
        }

        for(int i = 0; i < Math.ceil(N/2.0); i++) {
            String S = scan.next();
            char sChar[] = S.toCharArray();
            for (int j = 0; j < sChar.length; j++) {
                if(sChar[j] == '1') {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        int min = 1000;//N <= 200
        long answer = 0;
        for (int i = 0; i < graph.size(); i++) {
            ArrayList<Integer> firstGp = new ArrayList<>();
            ArrayList<Integer> secondGp = new ArrayList<>();
            firstGp.add(i);
            long count = 0;
            HashMap<Integer, Set<Integer>> tempGraph = new HashMap<>();
            for (int j = 0 ; j < N ; j++) {
                tempGraph.put(j, new HashSet<>(graph.get(j)));
            }
            while(!firstGp.isEmpty()) {
                count++;
                for (Integer pos : firstGp) {
                    for (Integer childPos : graph.get(pos)) {
                        if (firstGp.contains(childPos)) {
                            os.println(-1);
                            return;
                        }
                        if (!secondGp.contains(childPos))
                            secondGp.add(childPos);
                    }
                }
                for (Integer deletePos : firstGp) {
                    for (Integer pos : secondGp) {
                        graph.get(pos).remove(deletePos);
                    }
                }
                firstGp.clear();
                firstGp.addAll(secondGp);
                secondGp.clear();
            }
            graph = tempGraph;
            answer = Math.max(answer, count);
        }
        os.println(answer);

    }

}