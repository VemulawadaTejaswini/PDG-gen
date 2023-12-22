import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Main{
    
    static void swap(int a[], int l, int r) {
        int tmp = a[l];
        a[l] = a[r];
        a[r] = tmp;
    }

    static void perm(int[] a, int loc, int len, Consumer<int[]> f)
    {
        if(loc + 1 == len) {
            f.accept(a);
            return;
        }
        perm(a, loc+1, len, f);
        for(int i = loc + 1; i < a.length; i++) {
            swap(a, loc, i);
            perm(a, loc+1, len, f);
            swap(a, loc, i);
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                int[] gates = IntStream.range(0, 9).map(d->sc.nextInt()).toArray();
                int[] jackies = IntStream.range(0, 9).map(d->sc.nextInt()).toArray();
                int[] counts = new int[2];
                perm(gates, 0, 9, (int[] g) -> {
                    int gp = 0, jp = 0;
                    for(int j = 0; j < 9; j++) {
                        if(g[j] > jackies[j]) {
                            gp += (g[j] + jackies[j]);
                        }
                        else {
                            jp += (jackies[j] + g[j]);
                        }
                    }
                    if(gp > jp) {
                        counts[0]++;
                    }
                    else {
                        counts[1]++;
                    }
                });
                double total = counts[0] + counts[1];
                System.out.printf("%.5f %.5f\n", counts[0]/total, counts[1]/total);
            }
        }
    }
}
