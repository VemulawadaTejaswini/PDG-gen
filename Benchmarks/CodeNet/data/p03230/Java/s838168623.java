import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 2 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(k);
            for (int i = 0; i < k; i++) {
                int a = i + 1;
                int b;
                if (i == k - 1) {
                    b = 1;
                } else {
                    b = i + 2;
                }
                String ans = "2" + " " + a + " " + b;
                System.out.println(ans);
            }
        }
    }
}