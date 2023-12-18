import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Long> as = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            as.add(sc.nextLong());
        }

        List<Long> sekis = new ArrayList<>(n * (n-1)/2);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sekis.add(as.get(i) * as.get(j));
            }
        }

        sekis.sort(Long::compareTo);

        System.out.println(sekis.get(k - 1));
    }
}