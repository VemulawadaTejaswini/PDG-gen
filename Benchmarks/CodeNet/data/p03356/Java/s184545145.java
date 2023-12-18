import java.util.*;
public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] p = new int[N];
        UnionFind tree = new UnionFind(N);
        for (int i = 0; i < N; i++) {
            p[i] = scanner.nextInt()-1;
        }
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;
            tree.union(x,y);
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(tree.find(i) == tree.find(p[i])){
                count ++;
            }
        }
        System.out.println(count);
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