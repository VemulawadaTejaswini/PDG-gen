import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        List<Long> list = getDivisor(n);
        int l1 = String.valueOf(list.get(list.size() - 1)).length();
        int l2 = String.valueOf(list.get(list.size() - 2)).length();
        System.out.println(Math.max(l1, l2));
    }

    private static List<Long> getDivisor(long n) {
        List<Long> list = new ArrayList<>();
        long i = 1;
        while (i * i <= n) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
            i++;
        }
        return list;
    }
}