import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int k = Integer.parseInt(s.next());

        boolean[] flag = new boolean[n];
        Arrays.fill(flag, false);

        for (int i = 0; i < k; i++) {

            int d = Integer.parseInt(s.next());
            for (int j = 0; j < d; j++) {
                int dn = Integer.parseInt(s.next());
                flag[dn - 1] = true;
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!flag[i])
                count++;
        }

        System.out.println(count);
    }
}