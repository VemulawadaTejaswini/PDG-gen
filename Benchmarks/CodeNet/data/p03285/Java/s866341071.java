import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int a = 4;
        int b = 7;

        boolean isOk = false;
        for (int i = 0; i <= 100 / a; i++) {
            for (int j = 0; j <= 100 / b; j++) {
                if (i * a + j * 7 == n) {
                    isOk = true;
                    break;
                }
            }
        }

        if (isOk) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
