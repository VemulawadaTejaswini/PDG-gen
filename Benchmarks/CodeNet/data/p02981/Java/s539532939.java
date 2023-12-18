import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug == false) {
            return;
        }
        System.out.println(str);
    }

    //木構造
    public static void main(String[] args) {

        int N;
        int A;
        int B;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
        }
        int res = N * A < B ?N*A:B;
        System.out.println(res);


    }

}
