import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<m; i++) {
            int keta = sc.nextInt();
            int num = sc.nextInt();

            if (keta == 1 && num == 0 && n >= 2) {
                System.out.println(-1);
                return;
            }

            if (map.containsKey(keta)) {
                if (!map.get(keta).equals(num)) {
                    System.out.println(-1);
                    return;
                }
            }

            map.put(keta, num);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++) {
            if (map.containsKey(i)) {
                sb.append(map.get(i));
            } else {
                if (i == 1 && n >= 2) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
