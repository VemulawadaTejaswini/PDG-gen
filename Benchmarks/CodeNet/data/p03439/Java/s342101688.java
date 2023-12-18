import java.util.*;

public class Main {
    String pre, response;
    static Scanner sc;

    public void main() {
        int n = sc.nextInt();

        query(0);
        query(n - 1);

        int l = 0;
        int r = n - 1;
        while (true) {
            int id = (l + r) / 2;
            query(id);

            if (((r - id) % 2 == 0) == (pre.equals(response))) {
                r = id;
            } else {
                l = id;
            }
        }
    }

    private void query(int id) {
        System.out.println(id);
        System.out.flush();

        pre = response;
        response = sc.next();
        if (response.equals("Vacant")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().main();
        sc.close();
    }
}
