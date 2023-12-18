import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    static int N;
    static long[] a;

    static List<Long> left;
    static List<Long> right;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        a = new long[3 * N];
        left = new ArrayList<Long>();
        right = new ArrayList<Long>();

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            if (i < N) {
                left.add(a[i]);
            }
            else if (2 * N <= i) {
                right.add(a[i]);
            }
        }

        sc.close();

        Collections.sort(left);
        Collections.sort(right);
        //System.out.println(left);
        //System.out.println(right);
        removeNumber(left, right, N, 2*N - 1);

        System.out.println(sum(left) - sum(right));
    }

    private static void removeNumber(List<Long> left, List<Long> right, int l, int r) {

        long leftMin = left.get(0);
        long rightMax = right.get(right.size() - 1);

        long leftDiff = a[l] - leftMin; 
        long rightDiff = rightMax - a[r];

        if (leftDiff >= rightDiff) {
            left.remove(0);
            left = addNumber(left, a[l]);
            l++;
        } else {
            right.remove(right.size() - 1);
            right = addNumber(right, a[r]);
            r--;
        }

        if (l > r) {
            return;
        }

        //System.out.println(left);
        //System.out.println(right);
        removeNumber(left, right, l, r);
    }

    private static long sum(List<Long> list) {
        return list.stream().mapToLong(x -> (long)x).sum();
    }

    private static long min(List<Long> list) {
        return Collections.min(list);
    }

    private static long max(List<Long> list) {
        return Collections.max(list);
    }

    private static List<Long> addNumber(List<Long> list, long num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > num) {
                list.add(i, num);
                return list;
            }
        }
        list.add(num);
        return list;
    }
}

