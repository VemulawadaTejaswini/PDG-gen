import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        String s = sc.next();

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i-1) != s.charAt(i)) count++;
        }
        System.out.println(count);
    }
}

