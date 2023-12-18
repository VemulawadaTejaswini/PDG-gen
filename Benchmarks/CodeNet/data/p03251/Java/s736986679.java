import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        int max_x = x, min_y = y;
        for (int i = 0; i < n; i++) max_x = Math.max(max_x, sc.nextInt());
        for (int i = 0; i < m; i++) min_y = Math.min(min_y, sc.nextInt());
        System.out.println(max_x < min_y ? "No War": "War");
    }
}