import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int[][] dp;
    static Scanner sc;
    static int n;
    static int m;
    static int[][] graph;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[m][m];
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
            n1 = a;
            n2 = b;
        }

        LinkedList<Integer> path = new LinkedList<>();
        path.add(n1);
        path.add(n2);
        boolean flag = true;
        while (flag) {
            flag = false;
            int first = path.getFirst();
            for (int i = 0; i < n; i++) {
                if (graph[i][first] == 1 && !path.contains(i)) {
                    path.addFirst(i);
                    break;
                }
            }
            int last = path.getLast();
            for (int i = 0; i < n; i++) {
                if (graph[i][last] == 1 && !path.contains(i)) {
                    path.addLast(i);
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(path.size());
        for (Integer i : path) {
            System.out.print((i + 1) + " ");
        }
    }
}
