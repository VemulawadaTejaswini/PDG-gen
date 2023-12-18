import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt() - 1);
        }
        System.out.println(new Calculator(n, k, a).calculate());
    }
}

class Calculator {
    private long k;
    private int a0;
    private List<List<Integer>> lists = new ArrayList<>();

    Calculator(int n, long k, List<Integer> a) {
        this.k = k;
        for (int i = 0; i < n; i++) {
            this.lists.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                this.a0 = a.get(i);
            } else {
                this.lists.get(a.get(i)).add(i);
            }
        }
    }

    long calculate() {
        long r = dfs(0, 0);
        if (0 < this.a0) {
            r++;
        }
        return r;
    }

    private long dfs(int i, long count) {
        long r = 0;
        if (count == this.k + 1) {
            count = 1;
            r++;
        }
        for (int j : this.lists.get(i)) {
            r += dfs(j, count + 1);
        }
        return r;
    }
}