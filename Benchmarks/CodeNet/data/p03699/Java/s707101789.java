import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int total = 0;
        ArrayList<Integer> aa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            a.add(tmp);
            total += tmp;
            if(tmp % 10 != 0) {
                aa.add(tmp);
            }
        }
        if(total % 10 != 0) {
            System.out.println(total);
        } else {
            int min = 0;
            if(aa.size() > 0) {
                min = Collections.min(aa);
                System.out.println(total - min);
            } else {
                System.out.println(0);
            }
        }
    }
}