import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000003];
        a[0] = n;
        for (int i = 1 ; i < a.length ; i++) {
            if (a[i - 1] % 2 == 0) {
                a[i] = a[i - 1] / 2;
            } else {
                a[i] = 3 * a[i - 1] + 1;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int x : a) {
            if (set.contains(x)) {
                System.out.println(set.size() + 1);
                return;
            } else {
                set.add(x);
            }
        }
    }

}