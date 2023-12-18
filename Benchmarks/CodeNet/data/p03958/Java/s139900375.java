import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int T = sc.nextInt();
        int[] a = new int[T];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        int[] r = new int[K];
        int sameCount = 0;
        for (int i = 0; i < K; ++i) {
            int maxIdx = maxIdx(a);
            int minIdx = minIdx(a);
            if (i > 0 && r[i - 1] == maxIdx) {
                if (a[minIdx] > 0) {
                    a[minIdx]--;
                    r[i] = minIdx;
                    if (maxIdx == minIdx) {
                        sameCount++;
                    }
                } else {
                    a[maxIdx]--;
                    r[i] = maxIdx;
                    sameCount++;
                }
            } else {
                a[maxIdx]--;
                r[i] = maxIdx;
            }
        }
        System.out.println(sameCount);
    }
    private static int maxIdx(int[] a) {
        int max = -1;
        int maxIdx = -1;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
    private static int minIdx(int[] a) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        int zeroIdx = -1;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > 0 && a[i] < min) {
                min = a[i];
                minIdx = i;
            }
            if (a[i] == 0) {
                zeroIdx = i;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return zeroIdx;
        } else {
            return minIdx;
        }
    }
}