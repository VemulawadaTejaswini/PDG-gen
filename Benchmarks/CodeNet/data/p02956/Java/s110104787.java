import java.util.*;

public class Main {

    static int N;
    static int mod = 998244353;
    static long[] bit_right;
    static long[] bit_left;

    static long pow(long a,long n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a%mod;
            }
            a=a*a%mod;
            n>>=1;
        }
        return res;
    }

    static void add_left(int index, long val) {
        for (int i=index;i<=N;i+=(i&(-i))) {
            bit_left[i] += val;
        }
    }

    static long sum_left(int index) {
        long tmp = 0L;
        for (int i=index;i>0;i-=(i&(-i))) {
            tmp += bit_left[i];
        }
        return tmp;
    }

    static void add_right(int index, long val) {
        for (int i=index;i<=N;i+=(i&(-i))) {
            bit_right[i] += val;
        }
    }

    static long sum_right(int index) {
        long tmp = 0L;
        for (int i=index;i>0;i-=(i&(-i))) {
            tmp += bit_right[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        bit_left = new long[N+1];
        bit_right = new long[N+1];
        int[] x = new int[N];
        int[] y = new int[N];
        TreeSet<Integer> set_right = new TreeSet<Integer>();
        TreeSet<Integer> set_left = new TreeSet<Integer>();
        for (int i=0;i<N;i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            set_right.add(x[i]);
            set_left.add(y[i]);
        }
        ArrayList<Integer> list_right = new ArrayList<Integer>(set_right);
        ArrayList<Integer> list_left = new ArrayList<Integer>(set_left);
        for (int i=0;i<N;i++) {
            x[i] = Collections.binarySearch(list_right, x[i])+1;
            y[i] = Collections.binarySearch(list_left, y[i])+1;
            add_right(y[i], 1);
        }

        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i=0;i<N;i++) {
            int[] add = {x[i], y[i]};
            list.add(add);
        }

        Collections.sort(list, (o1, o2)->Integer.compare(o1[0], o2[0]));

        // System.out.println(Arrays.toString(x));
        // System.out.println(Arrays.toString(y));

        long ans = 0L;
        for (int i=0;i<N;i++) {
            int xx = list.get(i)[0];
            int yy = list.get(i)[1];

            add_left(yy, 1);
            add_right(yy, -1);

            long quadrant_2 = sum_left(N)-sum_left(yy);
            long quadrant_3 = sum_left(yy-1);

            long quadrant_1 = sum_right(N)-sum_right(yy);
            long quadrant_4 = sum_right(yy-1);

            // System.out.println("quadrant: "+quadrant_1+" "+quadrant_2+" "+quadrant_3+" "+quadrant_4+" ");
            // System.out.println(ans);
            ans = (ans+pow(2, N-1)+pow(2, N-1)-1-pow(2, quadrant_1+quadrant_2)-pow(2, quadrant_2+quadrant_3)-pow(2, quadrant_3+quadrant_4)-pow(2, quadrant_4+quadrant_1)
                       +pow(2, quadrant_1)+pow(2, quadrant_2)+pow(2, quadrant_3)+pow(2, quadrant_4)+4*(long)mod)%mod;
        }
        System.out.println(ans);
    }
}