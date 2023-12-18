import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int max = Collections.max(a);
        for (int i = 0; i < n; i++) {
            int tmp = a.get(i);
            if(max == tmp) {
                a.set(i, 0);
                int ans = Collections.max(a);
                System.out.println(ans);
                a.set(i, tmp);
            } else {
                System.out.println(max);
            }

        }
    }
}