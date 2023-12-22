import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int[] list = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
            Arrays.sort(list);
            System.out.println(list[0] * list[0] + list[1] * list[1] == list[2] * list[2] ? "YES" : "NO");
        }
        sc.close();
    }
}
