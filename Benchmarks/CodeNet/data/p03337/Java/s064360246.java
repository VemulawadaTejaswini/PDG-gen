import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = 0;
        int[] anss = new int[]{
                a + b,
                a - b,
                a * b
        };

        for (int ans : anss) {
            max = Math.max(max, ans);
        }

        System.out.println(max);
    }
}
