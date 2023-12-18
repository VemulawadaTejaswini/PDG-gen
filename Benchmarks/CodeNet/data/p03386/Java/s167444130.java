import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        Set<Integer> set = new HashSet<Integer>();

        for (int i = a; i <= b; i++) {
            if (i < a + k || i > b - k) {
                set.add(i);
            }
        }

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}