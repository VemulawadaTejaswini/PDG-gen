import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = in.next();
            }

            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                char[] cs = S[i].toCharArray();
                Arrays.sort(cs);
                list.add(new String(cs));
            }
            Collections.sort(list);

            long res = 0;
            long count = 1;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1).equals(list.get(i))) {
                    count++;
                } else {
                    res += (count * (count - 1)) / 2;
                    count = 1;
                }
            }
            res += (count * (count - 1)) / 2;

            System.out.println(res);
        }
    }
}
