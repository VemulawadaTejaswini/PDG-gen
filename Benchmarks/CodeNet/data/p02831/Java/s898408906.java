import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean isFind = false;
        for (int i = 1; i < 100001; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                isFind = true;
                break;
            }
        }

        if (!isFind) {
            System.out.println((long) a * b);
        }

    }
}
