import java.util.*;

public class Main {
    public void main(Scanner sc) {
        System.out.println((sc.nextInt() - 1) * (sc.nextInt() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
