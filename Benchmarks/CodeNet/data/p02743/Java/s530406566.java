import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = c-a-b;
        long tmp2 = (long)tmp*tmp;
        long tmp3 = (long)4 * a * b;
        if (tmp > 0 && tmp2 > tmp3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}