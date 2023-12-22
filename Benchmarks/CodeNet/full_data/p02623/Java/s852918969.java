
import java.io.*;
import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Long.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        ArrayDeque<Long> A = new ArrayDeque<>();
        ArrayDeque<Long> B = new ArrayDeque<>();

        st = new StringTokenizer(in.readLine());
        int N = parseInt(st.nextToken()), M = parseInt(st.nextToken());
        Long K = parseLong(st.nextToken());
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            A.add(parseLong(st.nextToken()));
        }
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < M; i++) {
            B.add(parseLong(st.nextToken()));
        }
        pw.println(solve(A, B, K));
        pw.close();
    }

    static Long solve(ArrayDeque<Long> A, ArrayDeque<Long> B, Long K) {
        Long res = Long.valueOf(0);
        while (true) {
            if (!A.isEmpty() && !B.isEmpty()) {
                if (A.peek() < B.peek()) {
                    if (A.peek() <= K) {
                        K -= A.poll();
                        res++;
                    }
                } else {
                    if (B.peek() <= K) {
                        K -= B.poll();
                        res++;
                    }
                }
                if (!A.isEmpty() && !B.isEmpty()) {
                    if (A.peek() > K && B.peek() > K) break;
                }
            } else if (!A.isEmpty() && A.peek() <= K) {
                K -= A.poll();
                res++;
            } else if (!B.isEmpty() && B.peek() <= K) {
                K -= B.poll();
                res++;
            } else {
                break;
            }
        }
        return res;
    }
}