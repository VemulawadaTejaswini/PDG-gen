import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        String s = sc.next();
        System.out.println(splits("", s));
    }

    int splits(String head, String tail) {
        if (tail.isEmpty()) return 0;

        for (int i = 1; i <= tail.length(); i++) {
            String h = tail.substring(0, i);
            if (head.equals(h)) continue;

            String t = tail.substring(i);
            int next = splits(h, t);
            if (next < 0) continue;

            return next + 1;
        }

        return -1;
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}