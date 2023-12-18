
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int M;
        int[] Xn;
        int[] Yn;
        int[] Zn;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            Xn = new int[M];
            Yn = new int[M];
            Zn = new int[M];
            for(int i =0;i < M;i++){
                Xn[i] = sc.nextInt()-1;
                Yn[i] = sc.nextInt()-1;
                Zn[i] = sc.nextInt();
            }
        }
        UnionF union = new UnionF(N);
        for(int i =0;i < M;i++){
            union.mergeSet(Xn[i], Yn[i]);
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < N;i++){
            set.add(union.root(i));
        }

        System.out.println(set.size());

    }
    public static class UnionF {
        int[] elements;
        int[] rank;

        public UnionF(int size) {
            this.elements = new int[size];
            this.rank = new int[size];
            for (int i = 0; i < elements.length; i++) {
                elements[i] = i;
                rank[i] = 0;
            }
        }

        public void mergeSet(int x, int y) {
            int i = root(x);

            int j = root(y);

            if (i == j) {
                return;
            }

            if (rank[i] > rank[j]) {
                elements[j] = i;

            } else {
                elements[i] = j;
                if (rank[i] == rank[j]) {
                    rank[i]++;
                }
            }
        }

        public int root(int x) {
            int i = x;
            while (elements[i] != i) {
                i = elements[i];
            }
            int root = i;
            //経路圧縮
            i = x;
            while (elements[i] != i) {
                i = elements[i];
                elements[i] = root;
            }
            return root;
        }

        public boolean isSameSet(int x, int y) {
            int i = root(x);

            int j = root(y);

            return i == j;
        }

        @Override
        public String toString() {
            return this.elements.toString();
        }

    }
}
