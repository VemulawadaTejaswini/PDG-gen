import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.ArrayList;

class Pair {
    long first;
    long second;

    Pair (long first, long second) {
        this.first = first;
        this.second = second;
    }
}

@SuppressWarnings("unchecked")
public class Main {
    // 約数
    static void devisor(ArrayList<Pair> dev,long N) {
        long n;
        long i = 1;

        n = N;

        while (i <= Math.sqrt(n)) {
            if (n % i == 0) dev.add(new Pair(i, n / i));
            i++;
        }
    }

    static int f(long first, long second) {
        return (int)Math.max(Math.log10(first), Math.log10(second)) + 1;
    }

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        long N = Long.parseLong(s);

        ArrayList<Pair> dev = new ArrayList<Pair>();

        devisor(dev, N);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < dev.size(); i++) {
            Pair p = dev.get(i);

            int tmp = f(p.first, p.second);

            ans = Math.min(ans, tmp);
        }

        out.println(ans);

        out.flush();
    }
}
