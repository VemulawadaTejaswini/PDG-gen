import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i< m;i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            if (i == 0) {
                for (int k= l[i]; k<=r[i];k++) {
                    set.add(k);
                }
            }
            for (int k= l[i]; k<=r[i];k++) {
                set2.add(k);
            }
            set.retainAll(set2);
        }

        System.out.println(set2.size());
    }
}