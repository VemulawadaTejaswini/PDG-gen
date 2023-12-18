import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();

            if (t == 1) {
                sb.reverse();
            } else if (t == 2) {
                int f = sc.nextInt();
                if (f == 1) {
                    sb.insert(0, sc.next());
                } else if (f == 2) {
                    sb.append(sc.next());
                }
            }
        }
        System.out.println(sb.toString());
    }
}

