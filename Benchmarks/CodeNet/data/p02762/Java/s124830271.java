import java.util.*;

public class Main{
    static int N;
    static Map<Integer,Set<Integer>> friend;
    static Map<Integer, Set<Integer>> block;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<ArrayList<Integer>> friend = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<N; i++) friend.add(new ArrayList<Integer>());

        UnionFind sns = new UnionFind(N);
        for(int i=0; i<M; i++){
            int a = scanner.nextInt() -1;
            int b = scanner.nextInt() -1;
            sns.union(a, b);
            friend.get(a).add(b);
            friend.get(b).add(a);
        }
        Map<Integer, List<Integer>> block = new HashMap<>();
        for(int i=0; i<N; i++){
            block.put(i, new ArrayList<>());
        }
        for(int i=0; i<K; i++){
            int c = scanner.nextInt() -1;
            int d = scanner.nextInt() -1;
            block.get(c).add(d);
            block.get(d).add(c);
        }
        for(int i=0; i<N; i++){
            int res = sns.size(i) - 1 - friend.get(i).size();
            for(int j:block.get(i)){
                if(sns.find(i) == sns.find(j)){
                    res--;
                }
            }
            System.out.print(res);
            System.out.print(" ");
        }

    }

    public static class UnionFind{
        private int[] d;
        public UnionFind(int num){
            d = new int[num];
            for(int i=0; i<num; i++){
                d[i] = -1;
            }
        }
        public void union(int a, int b){
            a = find(a);
            b = find(b);
            if(a == b){
                return;
            }
            if(-d[a] < -d[b]){
                int tmp = a;
                a = b;
                b = tmp;
            }
            d[a] += d[b];
            d[b] = a;
            // for(int i=0; i<d.length;i++){
            //     System.out.print(d[i]);
            //     System.out.print(" ");
            // }
        }
        public int find(int a){
            if(d[a] < 0){
                return a;
            }else{
                d[a] = find(d[a]);
                return d[a];
            }
        }
        public int size(int a){
            return -d[find(a)];
        }
    }
}