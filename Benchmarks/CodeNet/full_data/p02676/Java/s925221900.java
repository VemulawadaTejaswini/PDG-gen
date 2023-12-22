import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int k = sc.nextInt();
        String s = sc.next();
        if (s.length() <= k) {
            System.out.println(s);
            return;
        }

        System.out.println(s.substring(0, k) + "...");
    }
}

