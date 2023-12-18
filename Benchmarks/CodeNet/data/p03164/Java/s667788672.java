
import java.util.*;

class Solution {

    private int N;
    private int W;

    private List<Integer> w;
    private List<Integer> v;

    public int calculate(int weight, List<Integer> w, List<Integer> v) {
        W = weight;
        this.v = v;
        this.w = w;

        return calculate(weight, N - 1);
    }

    private int calculate(int weight, int pos) {
        if (pos < 0 || weight == 0) return 0;

        if (w.get(pos) > weight) return calculate(weight, pos - 1);

        int no = calculate(weight, pos - 1);
        int yes = v.get(pos) - calculate(weight, pos - 1);
        return Math.max(no, yes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();

        List<Integer> w = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            w.add(in.nextInt());
            v.add(in.nextInt());
        }

        Solution s = new Solution();
        int result = s.calculate(W, w, v);
        System.out.println(result);
    }

}
