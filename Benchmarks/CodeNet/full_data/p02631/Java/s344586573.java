import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = Integer.parseInt(s.nextLine());
            int[] a = Arrays.stream(s.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            int[] b = new int[n];
            int x = 0;
            for (int i = 1; i < n; i++) {
                b[i] = a[0] ^ a[i];
                x ^= b[i];
            }
            
            int flag = a[0] ^ x;
            for (int i = 0; i < n; i++) {
                b[i] ^= flag;
            }
            System.out.print(a[0]);
            for (int i = 1; i < n; i++) {
                System.out.print(" " + b[i]);
            }
            System.out.println();
        }
    }
}
