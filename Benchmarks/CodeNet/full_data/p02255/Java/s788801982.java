public class Main {
    public static void sort(int[] a) { sort(a, 0, a.length); }

    public static void sort(int[] a, int i0, int iN) {
        if (!(i0 < iN)) return;
        for (int i = i0 + 1; i < iN; i++) {
            int tmp = a[i];
            int j = i, k = i;
            if (tmp < a[i0])
                while (i0 < j) { a[j] = a[--k]; j = k; }
            else
                while (tmp < a[--k]) { a[j] = a[k]; j = k; }
            a[j] = tmp;
        }
    }
}