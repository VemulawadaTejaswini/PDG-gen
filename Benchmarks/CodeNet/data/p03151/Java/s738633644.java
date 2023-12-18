
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            B[i] = sc.nextInt();
        }

        int ans = solve4006394(N, A, B);

        System.out.println(ans);
    }

    private static int solve(int N, int[] A, int[] B) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i=0; i<N; i++) {
            if (A[i] - B[i] >= 0) {
                pos.add(A[i] - B[i]);
            } else {
                neg.add(B[i] - A[i]);
            }
        }

        Collections.sort(pos, Collections.reverseOrder());
        Collections.sort(neg, Collections.reverseOrder());

        int count = 0;
        int possum = 0;
        while (neg.size() > 0) {
            count++;
            int value = neg.remove(0);

            // System.err.println("current negative = " + value);
            while (possum < value && pos.size() > 0) {
                possum += pos.remove(0);
                // System.err.println("current pos:" + possum);
                count++;
                if (value <= possum) break;
            }

            if (possum < value) return -1;

            possum -= value;
        }

        return count;
    }

    private static int solve4006394(int N, int[] A, int[] B) {
        List<Long> list = new ArrayList<>();
        long aSum = 0;
        long bSum = 0;

        for (int i=0; i<N; i++) {
            list.add((long)(B[i]-A[i]));
            aSum += A[i];
            bSum += B[i];
        }

        if (aSum < bSum) return -1;
        Collections.sort(list);

        int result = 0;
        long plusSum = 0;
        long minSum = 0;
        for (int i=N-1; i>=0 && list.get(i)>0; i--) {
            plusSum += list.get(i);
            result++;
        }
        for (int i=0; i<N && minSum<plusSum; i++) {
            minSum -= list.get(i);
            result++;
        }

        return result;
    }
}
