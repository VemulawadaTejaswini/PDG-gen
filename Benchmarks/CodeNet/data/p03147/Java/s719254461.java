import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static class Range {
        int from;
        int to;

        Range(int from, int to)
        {
            this.from = from;
            this.to = to;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = scanner.nextInt();
        }

        int[] hs = new int[n];
        for (int i = 0; i < n; i++) {
            hs[i] = 0;
        }

        int count = 0;
        while (true) {
            List<Range> ranges = new ArrayList<>();
            Integer start = null;
            boolean goal = true;
            for (int i = 0; i < n; i++) {
                if (xs[i] != hs[i]) {
                    goal = false;

                    if (start == null) {
                        start = i;
                    }
                }
                else {
                    if (start != null) {
                        ranges.add(new Range(start, i));
                        start = null;
                    }
                }
            }
            if (goal) {
                System.out.println(count);
                return;
            }

            if (start != null) {
                ranges.add(new Range(start, n));
            }

            for (Range range : ranges) {
                for (int i = range.from; i < range.to; i++) {
                    hs[i] += 1;
                }
                count++;
            }
        }
    }
}

