import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLong());
        }
        long min = Collections.min(list);
        if(min >= n) {
            System.out.println(5);
        } else {
            long ans = (n / min) + 5;
            System.out.println(ans);
        }
    }
}