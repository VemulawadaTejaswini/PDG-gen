import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        List<Pair> pairs = new ArrayList<>();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
            pairs.add(i, new Pair(A[i], B[i], i));
        }

        long count = 0;
        for(int i = 1; i < M + 1; i++){
            long tmp = getMaxValueableSalary(i, pairs);
            count += tmp;
        }
        System.out.println(count);
    }

    private long getMaxValueableSalary(int i, List<Pair> pairs) {
        Optional<Pair> ans = pairs.stream().filter(o -> o.a <= i)
                .max(Comparator.comparingLong(o -> o.b));
        if(ans.isPresent()) {
            pairs.remove(ans.get());
            return ans.get().b;
        }
        return 0;
    }

    public class Pair {
        public long a;
        public long b;
        public long i;

        public Pair(long a, long b, long i) {
            this.a = a;
            this.b = b;
            this.i = i;
        }
    }
}
