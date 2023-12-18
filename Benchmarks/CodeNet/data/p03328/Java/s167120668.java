import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int gap = b - a;
        int sum = 0;
        for (int i = 1; i <= gap; i++) {
            sum += i;
        }
        System.out.println(sum - b);
    }
}
