import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int t = sc.nextInt();
        int s = sc.nextInt();
        int u = sc.nextInt();


        if (s * u < t) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }

}

