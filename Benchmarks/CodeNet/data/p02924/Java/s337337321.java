import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> ary1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ary1.add(i + 1);
        }
        int ans = 0;
        for (int i = 0; i < ary1.size() - 1; i++) {
            ans += ary1.get(i);
        }
        System.out.println(ans);
    }
}