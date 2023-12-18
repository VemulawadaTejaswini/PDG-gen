import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        sb.append(z+" ");
        sb.append(x+" ");
        sb.append(y);

        System.out.println(sb.toString());
    }

}
