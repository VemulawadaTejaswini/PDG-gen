import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        int tmp = 0;
        int next = 0;

        // 一人目
        next = sc.nextInt();
        tmp = next;

        for (int i = 1; i < n; i++) {
            next = sc.nextInt();
            int diff = 0;
            if (next < tmp) {
                diff = tmp - next;
                sum += diff;
            }
            tmp = next + diff;
        }
        System.out.println(sum);
    }
}