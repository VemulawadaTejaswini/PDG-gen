import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            list.add(sc.nextInt());
            list.add(0, sc.nextInt());
        }
        if (n % 2 == 1) {
            list.add(sc.nextInt());
            Collections.reverse(list);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}