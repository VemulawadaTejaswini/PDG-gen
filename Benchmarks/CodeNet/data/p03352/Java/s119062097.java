import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 1;
        if (n < 4) {
            max = 1;
        } else {
            for (int i = 2; i < 34; i++) {
                int b = 2;
                while (Math.pow(i, b) <= n) {
                    if (max < (int) Math.pow(i, b)) {
                        max = (int) Math.pow(i, b);
                    }
                    b++;
                }
            }
        }
        System.out.println(max);
    }
}