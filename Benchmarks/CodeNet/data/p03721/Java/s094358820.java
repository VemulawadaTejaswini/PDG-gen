import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextLong();

        Set<Integer> set = new TreeSet<>();
        int[] array = new int[100000 + 1];
        for (int i = 0; i < n; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            array[a] += b;
            set.add(a);
        }

        for (Integer v : set) {
            k -= array[v];
            if (k <= 0) {
                System.out.println(v);
                break;
            }
        }
    }

}