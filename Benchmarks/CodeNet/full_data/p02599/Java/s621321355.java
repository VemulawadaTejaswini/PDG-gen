import java.util.*;

public class Main {
    int[] BIT;

    void add(int i, int x){
        if (i == 0) return;
        for (int k = i; k < BIT.length ; k += (k & -k)) {
            BIT[k] += x;
        }
    }

    int sum(int i){
        if(i == 0) return 0;

        int s = 0;
        for (int k=i; k > 0; k -= (k & -k)){
            s += BIT[k];
        }
        return s;
    }

    class Query {
        int index, left, right;

        public Query(int index, int left, int right) {
            this.index = index;
            this.left  = left;
            this.right = right;
        }
    }

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] C = new int[N+1];
        for (int i = 1; i <= N; i++) {
            C[i] = Integer.valueOf(scanner.next());
        }

        Query[] queries = new Query[Q];
        for (int i = 0; i < Q; i++) {
            queries[i] = new Query(i, Integer.valueOf(scanner.next()), Integer.valueOf(scanner.next()));
        }

        //right昇順でソート
        Arrays.sort(queries, new Comparator<Query>() {
            @Override
            public int compare(Query o1, Query o2) {
                return o1.right - o2.right;
            }
        });

        BIT = new int[N+1];
        int[] CP = new int[N+1]; //添え字色の最も右に存在する球の場所
        int[] Ans = new int[Q];
        int index = 1;
        for (Query q : queries){
            while(index <= q.right){
                add(CP[C[index]], -1);
                add(index, 1);
                CP[C[index]] = index;
                index++;
            }
            Ans[q.index] = sum(q.right) - sum(q.left-1);
        }

        for (int ans : Ans){
            System.out.println(ans);
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
