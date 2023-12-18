import java.util.*;

public class Main {

    static int N;
    static int M;
    static int V;
    static int P;
    static Integer[] A;

    public static boolean isOK(int index) {
        long max = (long)A[index]+M;
        // long tmp = (long)(P-1)+(long)(N-index)-(long)M;
        long tmp = (long)(P-1)+(long)(N-index)-(long)V;

        // System.out.println("index, max, tmp: "+index+" "+max+" "+tmp);
        if (tmp>=0) {
            if (max>=A[P-1]) return true;
            else return false;
        } else {
            long sum = 0;
            // for (int i=P-1;i<N-index;i++) {
            for (int i=P-1;i<index;i++) {
                sum += A[i];
            }
            // if (sum-tmp*V <= max*((N-index)-(P-1)+1)) return true;
            // if (sum-tmp*M <= max*((N-index)-(P-1)+1)) return true;
            if (sum-tmp*M <= max*(index-(P-1))) return true;
            else return false;
        }
    }

    public static int binary_search() {
        int right = -1;
        int left = A.length;

        while (Math.abs(right - left) > 1) {
            int mid = left + (right - left) / 2;

            if (isOK(mid)) right = mid;
            else left = mid;
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());
        V = Integer.parseInt(sc.next());
        P = Integer.parseInt(sc.next());
        A = new Integer[N];
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(A, (o1, o2)->Integer.compare(o2, o1));
        // System.out.println(Arrays.toString(A));
        System.out.println(binary_search()+1);
    }
}