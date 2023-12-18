import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> as = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            as.add(sc.nextInt() - 1);
        }
        System.out.println(new Calculator(n, k, as).calculate());
    }
}

class Calculator {
    private int k;
    private long answer = 0;
    private List<List<Integer>> lists = new ArrayList<>();

    Calculator(int n, int k, List<Integer> as) {
        this.k = k;
        for (int i = 0; i < n; i++) {
            this.lists.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int j = as.get(i);
            if (i != 0) {
                this.lists.get(j).add(i);
            } else if (j != 0) {
                this.answer++;
            }
        }
    }

    long calculate() {
        dfs(0, 0);
        return this.answer;
    }

    private int dfs(int a, int pre) {
        int height = 0;
        for (int j : this.lists.get(a)) {
            height = Math.max(height, dfs(j, a));
        }
        if (pre != 0 && height == k - 1) {
            height = 0;
            this.answer++;
        } else {
            height++;
        }
        return height;
    }
}