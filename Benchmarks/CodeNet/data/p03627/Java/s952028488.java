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
        int n = in.nextInt();
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            if (map.get(x) != null) {
                map.put(x, map.get(x) + 1);
            } else map.put(x, 1);
        }
        TreeSet<Long> v = new TreeSet<>();
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) v.add(entry.getKey());
        }
        long ans = 1;
        if (v.size() > 1) {
            Iterator it = v.descendingIterator();
            int c = 0;
            while (it.hasNext()) {
                long i = (Long) it.next();
                ans *= i;
                c++;
                if (c == 2) break;
            }
        }
        else ans = 0;
        out.println(ans);
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