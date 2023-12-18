import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().start();
    }

    void start() throws Exception {
        start(new Scanner(System.in));
    }

    void start(Scanner sc) throws Exception{
        int n = sc.nextInt();
        int k = sc.nextInt();
        int v = 1;
        for (int i = 0; i < n; ++i) {
            int a = v * 2;
            int b = v + k;

            if (a < b) {v = a;} else {v = b;}
        }
        System.out.println(v);
    }
}
