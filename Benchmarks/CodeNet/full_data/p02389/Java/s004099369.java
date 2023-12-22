import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        main_ITP1_1_C(args);
    }

    public static void main_ITP1_1_C(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.format("%d %d", a * b, (a + b) * 2));
    }
}

