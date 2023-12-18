import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(a)
        int a = sc.nextInt();
        // 入力(b)
        int b = sc.nextInt();
        // 入力(c)
        int c = sc.nextInt();

        Map<Integer, Integer> color = new HashMap<>();
        color.put(a, a);
        color.put(b, b);
        color.put(c, c);
        System.out.println(color.size());
        sc.close();
    }
}