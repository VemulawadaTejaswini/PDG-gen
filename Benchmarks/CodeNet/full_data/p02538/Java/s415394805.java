import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    int n;
    long[] tree;
    int[] lazy;
    long[] sum10;
    int mod;

    private void push(int node, int a, int mid, int b) {
        tree[node * 2] = sumOfConsecutive(lazy[node], a, mid);
        tree[node  *2 + 1] = sumOfConsecutive(lazy[node], mid + 1, b);
        lazy[node * 2] = lazy[node];
        lazy[node * 2 + 1] = lazy[node];

        lazy[node] = 0;
    }

    private void insert(int from, int to, int num, int a, int b, int node) {
        if (from <= a && b <= to) {
            tree[node] = sumOfConsecutive(num, a, b);
            lazy[node] = num;
            return;
        }

        int mid = (a + b) / 2;
        if (lazy[node] != 0) push(node, a, mid, b);

        if (from <= mid) insert(from, to, num, a, mid, node * 2);
        if (to > mid) insert(from, to, num, mid + 1, b, node * 2 + 1);

        tree[node] = tree[node * 2 + 1] + tree[node * 2];
        tree[node] %= mod;
    }

    private long getSum(int from, int to, int a, int b, int node) {
        if (from <= a && b <= to) {
            return tree[node];
        }

        int mid = (a + b) / 2;
        if (lazy[node] != 0) push(node, a, mid, b);

        long sum = 0;
        if (from <= mid) sum += getSum(from, to, a, mid, node * 2);
        if (to > mid) sum += getSum(from, to, mid + 1, b, node  * 2 + 1);

        sum %= mod;
        return sum;
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        /*
        StringBuilder commands = new StringBuilder();
        commands.append(8 + " " + 1000 + "\n");
        char[] seq = new char[8];
        Arrays.fill(seq, '1');
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            Random r = new Random();
            int a = r.nextInt(8);
            int b = r.nextInt(8 - a);
            a++;
            b += a;
            int digit = r.nextInt(9) + 1;
            commands.append(a + " " + b + " " + digit);
            for (int j = a - 1; j <= b - 1; j++) {
                seq[j] = (char) (digit + '0');
            }
            results.add(new String(seq));
            commands.append("\n");
        }
        */
        //BufferedReader f = new BufferedReader(new StringReader(commands.toString()));
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        int q = Integer.parseInt(tokenizer.nextToken());

        sum10 = new long[n];
        long curr10 = 1;
        sum10[n - 1] = 1;
        mod = 998244353;
        for (int i = n - 2; i >= 0; i--) {
            curr10 *= 10;
            curr10 %= mod;
            sum10[i] += curr10;
            sum10[i] += sum10[i + 1];
            sum10[i] %= mod;
        }

        tree = new long[4 * n];
        lazy = new int[4 * n];
        insert(0, n - 1, 1, 0, n - 1, 1);

        //ArrayList<String> myResults = new ArrayList<String>();
        for (int q1 = 0; q1 < q; q1++) {
            tokenizer = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(tokenizer.nextToken()) - 1;
            int b = Integer.parseInt(tokenizer.nextToken()) - 1;
            int num = Integer.parseInt(tokenizer.nextToken());
            insert(a, b, num, 0, n - 1, 1);
            //myResults.add(String.valueOf(getSum(0, n - 1, 0, n - 1, 1)));
            out.println(getSum(0, n - 1, 0, n - 1, 1));
        }

        out.close();
    }

    private long sumOfConsecutive(int digit, int a, int b) {
        long sum = sum10[a];
        if (b != n - 1) sum -= sum10[b + 1];
        sum *= digit;
        sum %= mod;
        sum += mod;
        sum %= mod;
        return sum;
    }
}