import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        final int N = Integer.parseInt(l.trim());
        final ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        final int[] color = new int[N];
        final int[][] weight = new int[N][N];
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<Integer>());
            color[i] = -1;
        }
        for (int i = 0; i < N - 1; i++) {
            String line = sc.nextLine();
            int u = Integer.parseInt(line.split(" ")[0]);
            int v = Integer.parseInt(line.split(" ")[1]);
            int w = Integer.parseInt(line.split(" ")[2]);

            graph.get(u - 1).add(v - 1);
            graph.get(v - 1).add(u - 1);
            weight[u - 1][v - 1] = w;
            weight[v - 1][u - 1] = w;
        }
        for (int i = 0; i < N; i++) {
            if (dfs(graph, weight, i, 0, color) && allColored(color)) break;
//            System.out.println("=====next======");
        }
//        dfs(graph, weight, 0, 0, color);
        Arrays.stream(color).forEach(System.out::println);
    }

    private static boolean allColored(int[] color) {
        return Arrays.stream(color).filter(c -> c == -1).count() <= 0;
    }

    static int depth = 0;

    private static boolean dfs(ArrayList<ArrayList<Integer>> graph, int[][] weight, int start, int c, int[] color) {
        color[start] = c;
        ArrayList<Integer> nexts = graph.get(start);
//        System.out.println("now: " + start);
//        System.out.println("nexts: " + nexts);
//        System.out.println("color: " + c);

        for (int i = 0; i < nexts.size(); i++) {
            int next = nexts.get(i);
            int w = weight[start][next];
//            System.out.println("\tnext: " + next);
//            System.out.println("\tweight: " + w);
            int co = color[next];
//            System.out.println("\tcolor: " + co);

            if (co != -1) {
                if (w % 2 == 1 && co == color[start]) {
                    return false;
                }
                continue;
            }
            int nextC = c;
            if (w % 2 == 1) {
                nextC = 1 - c;
            }
            depth++;
//            System.out.println("======into" + depth + "=======");
            if (!dfs(graph, weight, next, nextC, color)) {
                depth--;
//                System.out.println("======false_out" + depth + "======");
                return false;
            }else{
//                System.out.println("======true_out" + depth + "======");
//                depth--;
            }
        }
        return true;
    }
}
