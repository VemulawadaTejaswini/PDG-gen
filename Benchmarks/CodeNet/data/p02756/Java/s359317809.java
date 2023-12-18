import java.util.Scanner;

class Solver {
    public void Solve() {
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        boolean reverce = false;
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();
            if (query == 1) {
                reverce = !reverce;
                continue;
            } else {
                int f = sc.nextInt();
                char c = sc.next().charAt(0);
                if (!reverce) {
                    if (f == 1) {
                        sb.insert(0, c);
                    } else {
                        sb.append(c);
                    }
                } else {
                    if (f == 2) {
                        sb.insert(0, c);
                    } else {
                        sb.append(c);
                    }
                }
            }
        }
        if (!reverce) {
            System.out.println(sb.toString());
        } else {
            System.out.println(sb.reverse().toString());
        }
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
