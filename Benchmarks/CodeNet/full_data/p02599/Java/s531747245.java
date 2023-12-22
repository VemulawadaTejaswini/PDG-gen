import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int c[] = new int[n];
        int l[] = new int[q];
        int r[] = new int[q];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        List<String> list = new ArrayList<String>();
        for (int j = 0; j < n; j++) {
            String s = Integer.toString(c[j]);
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        int max = list.size();
        for (int i = 0; i < q; i++) {
            list = new ArrayList<String>();
            for (int j = l[i] - 1; j < r[i]; j++) {
                String s = Integer.toString(c[j]);
                if (!list.contains(s)) {
                    list.add(s);
                    if (list.size() == max) {
                        break;
                    }
                }
            }
            System.out.println(list.size());
        }
    }
}
