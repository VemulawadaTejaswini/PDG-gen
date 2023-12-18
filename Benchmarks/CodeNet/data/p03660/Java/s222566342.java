import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer>[] adjacents = new List[N];
        for (int i = 0; i < N; i++) {
            adjacents[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            adjacents[a].add(b);
            adjacents[b].add(a);
        }
        int[] fromFennec = new int[N];
        Arrays.fill(fromFennec, N);
        Stack<Integer> stk = new Stack<>();
        fromFennec[0] = 0;
        stk.push(0);
        while (!stk.empty()) {
            int start = stk.pop();
            int dist = fromFennec[start] + 1;
            for (int i = 0; i < N; i++) {
                if (adjacents[start].contains(new Integer(i)) && fromFennec[i] == N) {
                    fromFennec[i] = dist;
                    stk.push(i);
                }
            }
        }
        int[] fromSnuke = new int[N];
        Arrays.fill(fromSnuke, N);
        fromSnuke[N - 1] = 0;
        stk.push(N - 1);
        while (!stk.empty()) {
            int start = stk.pop();
            int dist = fromSnuke[start] + 1;
            for (int i = 0; i < N; i++) {
                if (adjacents[start].contains(new Integer(i)) && fromSnuke[i] == N) {
                    fromSnuke[i] = dist;
                    stk.push(i);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (fromFennec[i] > fromSnuke[i]) {
                sum++;
            }
        }
        if (sum >= N / 2) {
            System.out.println("Snuke");
        } else {
            System.out.println("Fennec");
        }
    }
}
