import java.util.*;

public class Main {

    static long[] bit;
    static int n;
    static void add(int x, int y) {
        for (int i=x;i<=n;i+=i&(-i)) {
            bit[i]+=y;
        }
    }

    static long sum(int x) {
        long tmp = 0L;
        for (int i=x;i>0;i-=i&(-i)) {
            tmp+=bit[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        bit = new long[n+1];
        int[] a = new int[n];
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        for (int i=0;i<n;i++) {
            a[i] = Collections.binarySearch(list, a[i])+1;
        }
        long ans = 0L;
        for (int i=0;i<n;i++) {
            add(a[i], 1);
            ans+=sum(n)-sum(a[i]);
        }
        System.out.println(ans);
    }
}
