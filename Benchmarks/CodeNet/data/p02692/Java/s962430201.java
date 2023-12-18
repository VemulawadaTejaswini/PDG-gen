
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        Integer n = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        String[] ins = new String[n];
        Integer a = 0, b = 0, c = 0;

        for (int i = 0; i < n; i++) {
            ins[i] = sc.next();
            switch (ins[i]) {
                case "AB":
                    a++;
                    b++;
                    break;
                case "AC":
                    a++;
                    c++;
                    break;
                case "BC":
                    b++;
                    c++;
            }
        }

        V V1 = new V(A, a, "A");
        V V2 = new V(B, b, "B");
        V V3 = new V(C, c, "C");

        boolean ok = true;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            switch (ins[i]) {
                case "AB":
                    ok &= update(V1, V2, ans);
                    break;
                case "AC":
                    ok &= update(V1, V3, ans);
                    break;
                case "BC":
                    ok &= update(V2, V3, ans);
            }
            if (!ok) {
                break;
            }
        }

        if (ok) {
            out.println("Yes");
            for (String s : ans) {
                out.println(s);
            }
        } else {
            out.println("No");
        }

        out.flush();
    }

    boolean update(V X, V Y, ArrayList<String> ans) {
        if (X.X == 0 && Y.X == 0) {
            return false;
        } else if (X.X == 0) {
            ans.add(X.s);
            X.X++;
            Y.X--;
        } else if (Y.X == 0) {
            ans.add(Y.s);
            X.X--;
            Y.X++;
        } else if (X.X >= X.x) {
            ans.add(Y.s);
            X.X--;
            Y.X++;
        } else {
            if (X.X > Y.X) {
                ans.add(Y.s);
                X.X--;
                Y.X++;
            } else if (X.X < Y.X) {
                ans.add(X.s);
                X.X--;
                Y.X++;
            } else if (X.x > Y.x) {
                ans.add(X.s);
                X.X++;
                Y.X--;
            } else {
                ans.add(Y.s);
                X.X--;
                Y.X++;
            }
        }
        X.x--;
        Y.x--;
        return true;
    }

    class V {
        int X, x;
        String s;
        V(int X, int x, String s) {
            this.X = X;
            this.x = x;
            this.s = s;
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}