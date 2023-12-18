import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            int n = Integer.parseInt(s.nextLine());
            int[] a = Arrays.stream(s.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + a[i]; j < n; j++) {
                    if (j - i == a[i] + a[j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
