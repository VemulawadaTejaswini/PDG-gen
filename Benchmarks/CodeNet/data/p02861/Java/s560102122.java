import java.util.*;

public class Main {
    static boolean next_permutation(int[] p) {
      for (int a = p.length - 2; a >= 0; --a)
        if (p[a] < p[a + 1])
          for (int b = p.length - 1;; --b)
            if (p[b] > p[a]) {
              int t = p[a];
              p[a] = p[b];
              p[b] = t;
              for (++a, b = p.length - 1; a < b; ++a, --b) {
                t = p[a];
                p[a] = p[b];
                p[b] = t;
              }
              return true;
            }
      return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] x = new int[N];
        int[] y = new int[N];
        int[] xx = new int[N-1];
        int[] yy = new int[N-1];
        int[] array = new int[N];
        for (int i=0;i<N;i++) {
            array[i]=i;
        }
        for (int i=0;i<N;i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        for (int i=0;i<N-1;i++) {
            xx[i]=x[i+1]-x[i];
            yy[i]=y[i+1]-y[i];
        }
        double sum = 0;
        int div = 0;
        do {
            double tmp = 0L;
            for (int i=0;i<N-1;i++) {
                tmp+=Math.sqrt(Math.pow(x[array[i+1]]-x[array[i]], 2)+Math.pow(y[array[i+1]]-y[array[i]], 2));
            // System.out.println(Math.sqrt(Math.pow(x[array[i+1]]-x[array[i]], 2)+Math.pow(y[array[i+1]]-x[array[i]], 2)));
            }
            div+=1;
            sum+=tmp;
            // System.out.println(Arrays.toString(array));
        } while(next_permutation(array));
        System.out.println(sum/div);
    }
}