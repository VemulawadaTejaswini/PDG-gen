
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 2];
        int m = 1000;
        int c = 0;
        a[0] = 200; a[n + 1] = 100;

        for (int i = 1 ; i <= n ; i++) {
            a[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(200);
        for (int i = 1 ;  i < n + 2 ; i++) {
            if (a[i] != list.get(list.size()- 1)) {
                list.add(a[i]);
            }
        }
        for (int i = 0 ; i < list.size() - 2 ; i++) {
            if (list.get(i) > list.get(i + 1) && list.get(i + 1) < list.get(i + 2)) {
                c = m / list.get(i + 1);
                m %= list.get(i + 1);
            }
            if (list.get(i) < list.get(i + 1) && list.get(i + 1) > list.get(i + 2)) {
                m += c * list.get(i + 1);
            }
        }
        System.out.println(m);
    }

}