import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("No");
            return;
        }
        String s = sc.next();
        int l = (int) (n / 2);
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != s.charAt(l+i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

