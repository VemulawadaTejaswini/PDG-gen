import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aa = (int) (a * 12.5);
        int bb = 10 * b;
        int index = Math.max(a, b);
        while (index  < aa + bb) {
            if (index / 10 == b && index * 0.08 == a) {
                System.out.println(index);
                return;
            }
            index++;
        }
        System.out.println(-1);
    }
}
