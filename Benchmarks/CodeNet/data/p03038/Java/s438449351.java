import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        int[] c = new int[m];
        List<Pair> list = new ArrayList<>();
        for(int i=0; i<m; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            list.add(new Pair(b[i], c[i]));
        }
        Arrays.sort(a);
        Collections.sort(list);

        int index = 0;

        A: for(Pair p: list) {
            for(int i=0; i<p.b; i++) {
                if(p.c > a[index]) {
                    a[index] = p.c;
                }
                index++;
                if(index >= n) break A;
            }
        }

        long res = 0;
        for(int i=0; i<n; i++) {
            res += a[i];
        }

        System.out.println(res);


    }

    static class Pair implements Comparable<Pair> {
        int b, c;
        Pair(int b, int c) {
            this.b = b;
            this.c = c;
        }

        @Override public int compareTo(Pair o) {
            return o.c - c;
        }
    }

}
