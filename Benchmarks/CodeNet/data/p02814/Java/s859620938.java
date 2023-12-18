import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        int res = 0;
        for (int i = 1; i < m; i+=2) {
            if (semi(i, set)) res++;
        }
        System.out.println(res);
    }

    

    private static boolean semi(int i, Set<Integer> set) {
        for(int num : set)
        {
            if (i % num != num / 2) return false;
        }
        return true;
    }
}