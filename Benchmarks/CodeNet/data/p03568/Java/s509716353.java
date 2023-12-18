import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private void gen(int i, List<List<Integer>> res, List<Integer> cur, int N, int[] A) {
        if (cur.size() == N) {
            res.add(cur);
            return;
        }

        List<Integer> v1 = new ArrayList<Integer>(cur);
        v1.add(A[i] - 1);
        gen(i + 1, res, v1, N, A);

        List<Integer> v2 = new ArrayList<Integer>(cur);
        v2.add(A[i]);
        gen(i + 1, res, v2, N, A);

        List<Integer> v3 = new ArrayList<Integer>(cur);
        v3.add(A[i] + 1);
        gen(i + 1, res, v3, N, A);
    }


    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        gen(0, result, new ArrayList<Integer>(), N, A);
        for (List<Integer> l : result) {
            long sum = 1;
            for (Integer v :l)  {
                sum *= v;
            }
            if (sum % 2 == 0) cnt++;
        }
        System.out.println(cnt);

        return;
    }

}