public class Main {
    public static void sort(int[] a) { sort(a, 0, a.length); }

    public static void sort(int[] a, int i0, int iN) {
        if (!(i0 < iN)) return;
       for (int i = 1; i < MAX; i++) {
    int tmp = t[i];
    if (t[i-1] > tmp){
      int j = i;
      do {
        t[j] = t[j-1];
        --j;
      } while ( j > 0 && t[j-1] > tmp);
      t[j] = tmp;
    }
}