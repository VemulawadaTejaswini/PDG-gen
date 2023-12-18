import java.util.*;

public class Main {

    static int N;
    static int M;
    static int V;
    static int P;
    static Long[] A;

    public static boolean isOK(int index) {
        long max = (long)A[index]+M;
        long tmp = (long)(P-1)+(long)((long)N-index)-(long)V;

        // System.out.println("index, max, tmp: "+index+" "+max+" "+tmp);
        if (tmp>=0) {
            if (max>=(long)A[P-1]) return true;
            else return false;
        } else {
            long sum = 0;

            // if ((P-1)-index>=0) return true;

            for (int i=P-1;i<index;i++) {
                sum = sum+(long)A[i];
            }
            // System.out.println("sum "+sum);
            // System.out.println("max_"+(max*(index-(P-1))));
            // System.out.println("tmp_M "+(-tmp*M));
            // System.out.println(max*(index-(P-1))-(sum-tmp*M));
            if ((sum-tmp*M) <= max*(index-(P-1))) return true;
            else return false;
        }
    }

    public static int binary_search() {
        long right = -1;
        long left = N;

        while (Math.abs(right - left) > 1) {
            long mid = left + (right - left) / 2;

            if (isOK((int)mid)) right = mid;
            else left = mid;
        }
        return (int)right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());
        V = Integer.parseInt(sc.next());
        P = Integer.parseInt(sc.next());
        A = new Long[N];
        for (int i=0;i<N;i++) {
            A[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(A, (o1, o2)->Long.compare(o2, o1));
        // System.out.println(Arrays.toString(A));
        System.out.println(binary_search()+1);
    }
}