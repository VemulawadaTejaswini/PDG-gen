import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        int N = scanInt();
        long A = scanLong(), B = scanLong(), C = scanLong();
        char[] ans = new char[N];

        if (A != 0 && B != 0 && C != 0) {
            for (int i = 0; i < N; i++) {
                String str = scanString();
                if (str.equals("AB")) {
                    if (A == 0 && B == 0) {
                        out.println("No");
                        return;
                    }
                    if (A < B) {
                        A++;
                        B--;
                        ans[i] = 'A';
                    } else {
                        B++;
                        A--;
                        ans[i] = 'B';
                    }
                } else if (str.equals("BC")) {
                    if (B == 0 && C == 0) {
                        out.println("No");
                        return;
                    }
                    if (B < C) {
                        B++;
                        C--;
                        ans[i] = 'B';
                    } else {
                        C++;
                        B--;
                        ans[i] = 'C';
                    }
                } else {
                    if (A == 0 && C == 0) {
                        out.println("No");
                        return;
                    }
                    if (A < C) {
                        A++;
                        C--;
                        ans[i] = 'A';
                    } else {
                        C++;
                        A--;
                        ans[i] = 'C';
                    }
                }
            }

            out.println("Yes");
            for (int i = 0; i < N; i++) {
                out.println(ans[i]);
            }
        } else {
            for (int i = 0; i < N; i++) {
                String str = scanString();
                if (str.equals("AB")) {
                    if (A == 0 && B == 0) {
                        out.println("No");
                        return;
                    }
                    if (i < N && A == 1 && B == 1 && C == 0) {
                        String next = scanString();
                        if (next.equals("AC")) {
                            A++;
                            B--;
                            ans[i] = 'A';
                            i++;
                            A--;
                            C++;
                            ans[i] = 'C';
                        } else if (next.equals("BC")) {
                            B++;
                            A--;
                            ans[i] = 'B';
                            i++;
                            B--;
                            C++;
                            ans[i] = 'C';
                        } else {
                            A++;
                            B--;
                            ans[i] = 'A';
                            i++;
                            A--;
                            B++;
                            ans[i] = 'B';
                        }

                    } else if (A < B) {
                        A++;
                        B--;
                        ans[i] = 'A';
                    } else {
                        B++;
                        A--;
                        ans[i] = 'B';
                    }
                } else if (str.equals("BC")) {
                    if (B == 0 && C == 0) {
                        out.println("No");
                        return;
                    }
                    if (i < N && B == 1 && C == 1 && A == 0) {
                        String next = scanString();
                        if (next.equals("AB")) {
                            B++;
                            C--;
                            ans[i] = 'B';
                            i++;
                            B--;
                            A++;
                            ans[i] = 'A';
                        } else if (next.equals("AC")) {
                            C++;
                            B--;
                            ans[i] = 'C';
                            i++;
                            C--;
                            A++;
                            ans[i] = 'A';
                        } else {
                            C++;
                            B--;
                            ans[i] = 'C';
                            i++;
                            C--;
                            B++;
                            ans[i] = 'B';
                        }
                    } else if (B < C) {
                        B++;
                        C--;
                        ans[i] = 'B';
                    } else {
                        C++;
                        B--;
                        ans[i] = 'C';
                    }
                } else {
                    if (A == 0 && C == 0) {
                        out.println("No");
                        return;
                    }

                    if (i < N && A == 1 && C == 1 && C == 0) {
                        String next = scanString();
                        if (next.equals("AB")) {
                            A++;
                            C--;
                            ans[i] = 'A';
                            i++;
                            A--;
                            B++;
                            ans[i] = 'B';
                        } else if (next.equals("BC")) {
                            C++;
                            A--;
                            ans[i] = 'A';
                            i++;
                            C--;
                            B++;
                            ans[i] = 'B';
                        } else {
                            A++;
                            C--;
                            ans[i] = 'A';
                            i++;
                            A--;
                            C++;
                            ans[i] = 'C';
                        }
                    } else if (A < C) {
                        A++;
                        C--;
                        ans[i] = 'A';
                    } else {
                        C++;
                        A--;
                        ans[i] = 'C';
                    }
                }
            }

            out.println("Yes");
            for (int i = 0; i < N; i++) {
                out.println(ans[i]);
            }
        }
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}