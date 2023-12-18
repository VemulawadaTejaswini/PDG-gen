import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
            if (map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }

        long[] ans = new long[N];
        int index = 0;
        int sum = N;
        int x = 0;
        int y = 0;

        long tmp = 0L;
        int i_before = 0;
        for (int i=0;i<N;i++) {
            if (x<a[i] && a[i]<y) tmp+=a[i]-x;
            while (map.size()>0 && map.firstKey()<a[i]) {
                // tmp += (long)(map.firstKey()+1-index)*map.get(map.firstKey());
                // System.out.println("ind, first: "+index+" "+map.firstKey());
                sum -= map.get(map.firstKey());
                map.remove(map.firstKey());
            }
            if (a[i]>index) {
                ans[i] = (long)sum*(a[i]-index);
                ans[i_before] += tmp;
                // System.out.println("tmp: "+tmp);
                tmp = 0;
                // ans[i] = tmp;
                // tmp = 0;
                index = a[i];
                x = y;
                y = index;
                i_before = i;
            }
            if (i==N-1) ans[i_before]+=tmp;
        }

        for (int i=0;i<N;i++) System.out.println(ans[i]);
    }
}