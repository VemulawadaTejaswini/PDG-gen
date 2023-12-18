import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < b; i++) {
                sb.append(a);
            }

            System.out.println(sb);
        } else {
            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < a; i++) {
                sb.append(b);
            }

            System.out.println(sb);
        }
    }

}
