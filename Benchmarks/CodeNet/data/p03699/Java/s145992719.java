import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(sc.next());
            sum += s;
            if (s % 10 != 0) {
                list.add(s);
            }
        }
        if (sum % 10 != 0) {
            System.out.println(sum);
            return;
        } else if (list.size() == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            sum -= list.get(i);
            if (sum % 10 != 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}