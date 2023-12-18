import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int[] b = new int[n];
        for (int i=0;i<n;i++) {
            b[i] = sc.nextInt();
        }
        long[] ruiseki = new long[n+1];
        for (int i=0;i<n;i++) {
            ruiseki[i+1] = ruiseki[i]+b[i];
        }

        int N = n*(n+1)/2;
        int[][] bit = new int[N][50];
        // int[] a = new int[N];
        // for (int i=0;i<N;i++) {
        //     a[i] = sc.nextInt();
        //     int aa = a[i];
        //     for (int j=0;j<50;j++) {
        //         bit[i][j] = (aa&1);
        //         aa=(aa>>1);
        //     }
        // }
        ArrayList<Long> a = new ArrayList<Long>();
        int index = 0;
        for (int i=0;i<n;i++) {
            for (int k=i+1;k<n+1;k++) {
                // a[i] = ruiseki[k+1]-ruiseki[i];
                long aa = ruiseki[k]-ruiseki[i];
                a.add(aa);
                for (int j=0;j<50;j++) {
                    bit[index][j] = (int)(aa&1);
                    aa=(aa>>1);
                }
                index++;
            }
        }
        // System.out.println(a);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<N;i++) list.add(i);
        for (int j=49;j>=0;j--) {
            int cnt = 0;
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for (Integer i : list) {
                if (bit[i][j]==1) {
                    cnt++;
                    tmp.add(i);
                }
            }
            // System.out.println("j, tmp "+j+" "+tmp);
            if (cnt>=K) list=tmp;
        }
        // System.out.println(list);
        long ans = a.get(list.get(0));
        for (int i=1;i<list.size();i++) {
            ans = ans&a.get(list.get(i));
        }
        System.out.println(ans);
        // System.out.println(Arrays.deepToString(bit));
    }
}