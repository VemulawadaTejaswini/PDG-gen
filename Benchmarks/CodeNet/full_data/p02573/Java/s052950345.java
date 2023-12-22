import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        UF uf = new UF(n);
        for(int i=0 ;i< m; i++) {
            uf.join(sc.nextInt() - 1, sc.nextInt() - 1);
        }

        int[] c = new int[n];
        int max = 0;
        for(int i=0; i<n; i++) {
            c[uf.root(i)]++;
            max = Math.max(max, c[uf.root(i)]);
        }
        System.out.println(max);

    }

    static class UF {
        int[] p;
        int n;

        UF(int n) {
            this.n = n;
            p = new int[n];
            for(int i=0; i<n; i++){
                p[i] = i;
            }
        }
        int root(int a) {
            if(p[a] == a) {
                return a;
            }

            int res =  root(p[a]);
            p[a] = res;
            return res;

        }

        void join(int a ,int b) {
            p[root(a)] = p[root(b)];
        }
    }




}