import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int na, nb, budget;

        na = Integer.parseInt(st.nextToken());
        nb = Integer.parseInt(st.nextToken());
        budget = Integer.parseInt(st.nextToken());

        long[] A = new long[na];
        long[] B = new long[nb];
        long all = 0;
        int ans = na + nb;

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < na; i++) {
            A[i] = Long.parseLong(st.nextToken());
            all += A[i];
        }

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < nb; i++) {
            B[i] = Long.parseLong(st.nextToken());
            all += B[i];
        }

        int ptrA = na-1;
        int ptrB = nb-1;
        while (all > budget) {
            if (ptrA < 0 && ptrB < 0) break;
            long takeA = all;
            long takeB = all;
            if (ptrA >= 0) takeA -= A[ptrA];
            if (ptrB >= 0) takeB -= B[ptrB];
            if (takeA <= takeB) {
                all = takeA;
                ptrA--;
            } else {
                all = takeB;
                ptrB--;
            }
            ans --;
        }

        out.println(ans);
        out.close();

    }

}
