import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        String s = sc.next();

        int sum = 1;
        int head = 0, tail = 1;
        for (int i = 1; i < s.length(); i++) {
            int h = tail, t = i + 1;
            if (tail - head == t - h && s.charAt(i - h + head) == s.charAt(i)) continue;

            sum += 1;
            head = h;
            tail = t;
        }

        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}