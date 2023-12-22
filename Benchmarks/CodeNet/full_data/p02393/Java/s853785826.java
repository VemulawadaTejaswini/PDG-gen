import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println(sort(scan.nextInt() , scan.nextInt(), scan.nextInt()));
    }

    /**
     * ソートして返します。
     */
    private static String sort(int a, int b, int c) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        return list.get(0) + " " + list.get(1) + " " + list.get(2);
    }
}