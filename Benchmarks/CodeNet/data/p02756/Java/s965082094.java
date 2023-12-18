import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        StringBuilder bf = new StringBuilder(sc.next());

        sc.nextLine();
        int q = sc.nextInt();
        boolean reverse = false;
        List<String> addBeggining = new ArrayList<>();
        List<String> addEnd = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            sc.nextLine();
            int t = sc.nextInt();
            if (t == 1) {
                reverse = !reverse;
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    if (!reverse) {
                        addBeggining.add(sc.next());
                    } else {
                        addEnd.add(sc.next());
                    }
                } else {
                    if (!reverse) {
                        addEnd.add(sc.next());
                    } else {
                        addBeggining.add(sc.next());
                    }
                }
            }
        }
        String str;
        if (!reverse) {
            Collections.reverse(addBeggining);
            str = bf.toString();
            System.out.println(String.join("", addBeggining) + str + String.join("", addEnd));
        } else {
            Collections.reverse(addEnd);
            str = bf.reverse().toString();
            System.out.println(String.join("", addEnd) + str + String.join("", addBeggining));
        }
    }
}
