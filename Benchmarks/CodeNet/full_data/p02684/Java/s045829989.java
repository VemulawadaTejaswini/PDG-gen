import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt() - 1;
        }
        Set<Integer> set = new HashSet<>();
        int index = 0;
        while (!set.contains(index)) {
            set.add(index);
            index = A[index];
        }
        int l = set.size();
        set.clear();
        int step = 0;
        while (!set.contains(index)) {
            set.add(index);
            index = A[index];
            step++;
        }
        int pre = l - step + 1;
        long r = (K - pre) % step;
        int res = A[index];
        while (r != 0) {
            res = A[res];
            r--;
        }
        System.out.println(res + 1);
        sc.close();
    }
}