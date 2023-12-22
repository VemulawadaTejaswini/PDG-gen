import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        main_ITP1_1_D(args);
    }

    public static void main_ITP1_1_D(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int h = n / (60 * 60);
        int m = (n / 60) % 60;
        int s = n % 60;
        System.out.println(String.format("%d:%d:%d", h, m, s));
    }
}

