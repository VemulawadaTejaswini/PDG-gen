import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private boolean ok(int A, int B, int C) {
        return (A % 2 == 0) && (B % 2 == 0) && (C % 2 == 0);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        Set<String> set = new HashSet<>();

        int cnt = 0;
        int a = A;
        int b = B;
        int c = C;
        while (ok(a, b, c)) {
            String s = String.format("%d,%d,%d", a, b, c);
            if (set.contains(s)) {
                cnt = -1;
                break;
            }
            set.add(s);

            int at = b / 2 + c / 2;
            int bt = c / 2 + a / 2;
            int ct = a / 2 + b / 2;

            a = at;
            b = bt;
            c = ct;
            cnt++;
        }

        System.out.println(cnt);
        return;
    }

}