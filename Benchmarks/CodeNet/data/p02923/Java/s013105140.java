import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int prev = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            if (curr <= prev) {
                if (max < ++c) {
                    max = c;
                }
            } else {
                c = 0;
            }
            prev = curr;
        }
        System.out.println(max);
    }
}
