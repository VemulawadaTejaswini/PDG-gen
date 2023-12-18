import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long[] x = new long[N];
        long[] y = new long[N];
        long[] z = new long[N];
        for (int i=0;i<N;i++) {
            x[i] = Long.parseLong(sc.next());
            y[i] = Long.parseLong(sc.next());
            z[i] = Long.parseLong(sc.next());
        }
        ArrayList<int[]> flag = new ArrayList<int[]>();
        for (int i=0;i<1<<3;i++) {
            int x_flag = (int)Math.pow(-1, (i>>2)&1);
            int y_flag = (int)Math.pow(-1, (i>>1)&1);
            int z_flag = (int)Math.pow(-1, (i>>0)&1);
            int[] add = {x_flag, y_flag, z_flag};
            flag.add(add);
        }

        Comparator<Long> comparator = new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return Long.compare(o2, o1);
            }
        };

        long ans = 0L;
        for (int j=0;j<1<<3;j++) {
            Long[] value = new Long[N];
            for (int i=0;i<N;i++) {
                value[i] = x[i]*flag.get(j)[0]+y[i]*flag.get(j)[1]+z[i]*flag.get(j)[2];
            }
            Arrays.sort(value, comparator);
            long tmp_ans = 0L;
            for (int i=0;i<M;i++) {
                tmp_ans += value[i];
            }
            ans = Math.max(ans, tmp_ans);
        }
        System.out.println(ans);
    }
}