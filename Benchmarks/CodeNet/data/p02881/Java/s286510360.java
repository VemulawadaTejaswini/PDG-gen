import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    private static List<Long> factorize(long n)
    {
        double max = Math.sqrt(n);
        List<Long> xs = new ArrayList<>();
        for (long i = 2; i <= max; i++) {
            while (n % i == 0) {
                xs.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            xs.add(n);
        }
        return xs;
    }

    private static class Elm
    {
        final int pos;
        final ArrayList<Long> elms;

        public Elm(int pos, ArrayList<Long> elms)
        {
            this.pos = pos;
            this.elms = elms;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        List<Long> xs = factorize(n);
        long candidateA = n;
        long candidateB = 1;

        LinkedList<Elm> queue = new LinkedList<>();
        queue.add(new Elm(0, new ArrayList<>()));
        Set<Long> done = new HashSet<>();

        while (!queue.isEmpty()) {
            Elm elm = queue.removeFirst();
            if (elm.pos >= xs.size()) {
                continue;
            }

            if (!elm.elms.isEmpty()) {
                long prod = elm.elms.stream().reduce(1L, (a, b) -> a * b);
                if (done.contains(prod)) {
                    continue;
                }
                done.add(prod);
                long x = n / prod;
                if (Math.abs(prod - x) < Math.abs(candidateA - candidateB)) {
                    candidateA = prod;
                    candidateB = x;
                }
            }
            {
                ArrayList<Long> list = new ArrayList<>(elm.elms);
                queue.add(new Elm(elm.pos + 1, list));
            }
            {
                ArrayList<Long> list = new ArrayList<>(elm.elms);
                list.add(xs.get(elm.pos));
                queue.add(new Elm(elm.pos + 1, list));
            }
        }

        System.out.println((candidateA - 1) + (candidateB - 1));
    }
}
