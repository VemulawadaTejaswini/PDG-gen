import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    class Triple {
        int l, r, index;
        Triple(int l, int r, int index) {
            this.l = l;
            this.r = r;
            this.index = index;
        }
    }
    class BIT {
        int[] value;
        int n;
        BIT(int n) {
            this.n = n;
            this.value = new int[n + 1];
        }
        void update(int index, int delta) {
            while (index <= n) {
                this.value[index] += delta;
                index += lsb(index);
            }
        }
        int lsb(int index) {
            return index & (-index);
        }
        int sum(int index) {
            int total = 0;
            while (index > 0) {
                total += value[index];
                index -= lsb(index);
            }
            return total;
        }
    }
    void solve(Scanner sc, PrintWriter pw) {
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Triple[] queries = new Triple[Q];
        int[] result = new int[Q];
        int[] lastVisit = new int[N + 1];
        Arrays.fill(lastVisit, -1);
        int[] c = new int[N + 1];
        for (int i = 0; i < N; i++) {
            c[i + 1] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            queries[i] = new Triple(sc.nextInt(), sc.nextInt(), i);
        }
        Arrays.sort(queries, Comparator.comparingInt(x -> x.r));

        int queryIndex = 0;
        BIT bit = new BIT(N);
        for (int i = 1; i <= N; i++) {
            if (lastVisit[c[i]] != -1) {
                bit.update(lastVisit[c[i]], -1);
            }
            lastVisit[c[i]] = i;
            bit.update(i, 1);

            int currentSum = bit.sum(i);
            while (queryIndex < Q && queries[queryIndex].r == i) {
                result[queries[queryIndex].index] = currentSum - bit.sum(queries[queryIndex].l - 1);
                queryIndex++;
            }
        }
        for (int i = 0; i < Q; i++) {
            pw.println(result[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}
