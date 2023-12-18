import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        for (int i = 1; i < 50000; i++) {
            int ans = i * 108 / 100;
            if (ans == n) {
                result = i;
                break;
            }
        }
        if (result != 0) {
            System.out.println(result);
        } else {
            System.out.println(":(");
        }
        sc.close();
    }

}
