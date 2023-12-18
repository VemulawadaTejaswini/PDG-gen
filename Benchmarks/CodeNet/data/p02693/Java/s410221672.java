import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=a; i<=b; i++) {
            if (i % k ==0) {
                System.out.println("OK\n");
                return;
            }
        }

        System.out.println("NG\n");
    }
}
