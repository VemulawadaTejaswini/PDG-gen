import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int p = sc.nextInt() + a * 3;

        //        for (int i = 0; i < m; i++) {
        //
        //        }

        sc.close();

        System.out.println(p / 2);

    }
}