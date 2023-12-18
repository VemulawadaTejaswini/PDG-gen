import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().execute();
    }

    int N = 0;
    int A = 0;
    int B = 0;
    int C = 0;
    int[] l = null;

    class B {
        int d;
        int a;
        int b;
        int c;
        int p;

        B(int d, int a, int b, int c, int p) {
            this.d = d;
            this.a = a;
            this.b = b;
            this.c = c;
            this.p = p;
        }
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        l = new int[N];

        for (int i = 0; i < N; i++) {
            l[i] = sc.nextInt();
        }

        int r = Integer.MAX_VALUE;

        LinkedList<B> s = new LinkedList<>();
        s.push(new B(0, 0, 0, 0, 0));
        while (!s.isEmpty()) {
            B b = s.pop();

            if (b.d == N) {
                if (b.a != 0 && b.b != 0 && b.c != 0) {
                    r = Math.min(r, Math.abs(A - b.a) + Math.abs(B - b.b) + Math.abs(C - b.c) + b.p);
                }
                continue;
            }
            s.push(new B(b.d + 1, b.a, b.b, b.c, b.p));
            s.push(new B(b.d + 1, b.a + l[b.d], b.b, b.c, b.p + (b.a == 0 ? 0 : 10)));
            s.push(new B(b.d + 1, b.a, b.b + l[b.d], b.c, b.p + (b.b == 0 ? 0 : 10)));
            s.push(new B(b.d + 1, b.a, b.b, b.c + l[b.d], b.p + (b.c == 0 ? 0 : 10)));
        }
        System.out.println(r);
    }
}