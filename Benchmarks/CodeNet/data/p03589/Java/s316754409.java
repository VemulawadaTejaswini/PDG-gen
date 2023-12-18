import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int test_cases = 1;
        Solver s = new Solver();
        for (int i = 1; i <= test_cases; i++) {
            s.solve(i, in, out);
        }
        out.close();
    }
}

class Solver {
    void solve(int test_number, InputReader in, PrintWriter out) throws IOException {
        long n = in.nextInt();
        for (int i = 3500; i >= 0; i--) {
            for (int j = 1; j <= 3500; j++) {
                long a = n * i * j;
                long b = 4 * i * j - i * n - n * j;
                if (b > 0 && a % b == 0) {
                    out.println(i + " " + j + " " + a / b);
                    return;
                }
            }
        }
    }
}


class InputReader {
    BufferedReader br;
    StringTokenizer st;

    public InputReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}