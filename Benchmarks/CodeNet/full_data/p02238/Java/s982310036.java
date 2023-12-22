import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static List<PriorityQueue<Integer>> list;
    static int[] start;
    static int[] finish;
    static int time;

    private static void dfs(int i) {
        if(start[i] > 0) return;
        time++;
        start[i] = time;
        while(!list.get(i).isEmpty()) {
            dfs(list.get(i).poll());
        }
        time++;
        finish[i] = time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            PriorityQueue<Integer> set = new PriorityQueue<>();
            list.add(set);
        }

        for(int i = 0; i < n; i++) {
            int u = sc.nextInt() - 1;
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                list.get(u).add(sc.nextInt() - 1);
            }
        }

        start = new int[n];
        finish = new int[n];
        time = 0;
        for(int i = 0; i < n; i++) {
            dfs(i);
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", i + 1, start[i], finish[i]);
        }

        sc.close();
    }
}

