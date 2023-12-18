import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            int b = Integer.parseInt(sc.next());
            for (int j = 0; j < b; j++) {
                list.add(a);
            }
        }
        Collections.sort(list);
        System.out.println(list.get((int) k - 1));
    }
}