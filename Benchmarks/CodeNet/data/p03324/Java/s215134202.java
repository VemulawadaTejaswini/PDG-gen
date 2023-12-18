import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;

        for (int d = sc.nextInt(); d > 0; d--) {
            a = a * 100;
        }

        int n = sc.nextInt();
        System.out.println(n * a);

    }
}

