import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hatipa = 0;

        for (int i = 1; i <= 1250; i++) {
            hatipa = (int) Math.floor(i * 0.08);
            if (hatipa == a) {
                if ((int) Math.floor(i * 0.1) == b) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}