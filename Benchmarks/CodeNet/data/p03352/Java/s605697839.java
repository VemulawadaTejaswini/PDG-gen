import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int max = 0;

        for (int i = 1; i < 32; i++) {
            if (i * i <= x) {
                max = i * i;
            }
        }
        System.out.println(max);
    }
}
