import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            count++;
            list.add((int) n % 10);
            n /= 10;
        }
        if (list.size() == 1) {
            System.out.println(list.get(0));
            return;
        }
        boolean flg = true;
        for (int i = 1 ; i < list.size() ; i++) {
            if (list.get(i) != 9) {
                flg = false;
            }
        }
        if (flg) {
            System.out.println(list.get(list.size() - 1) + (list.size() - 1) * 9);
        } else {
            System.out.println(list.get(list.size() - 1) + (list.size() - 1) * 9 - 1);
        }
    }

}