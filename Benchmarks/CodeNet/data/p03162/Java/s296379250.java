import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        static int cacheHit = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int activities[][] = new int[N][3];
            Map<Key, Integer> memo = new HashMap<>();
            for (int i = 0; i < N; i++)
            {
                activities[i] = CPUtils.readIntArray(3, in);
            }
            out.println(solve(N, 0, '0', activities, memo));
            //out.print(cacheHit);
        }

        private int solve(int n, int day, char prev, int[][] activities, Map<Key, Integer> memo)
        {
            if (day == n) return 0;

            int score = 0;
            char activity = '0';
            if (prev != 'A')
            {
                Key key = new Key(day, 'A');
                if (memo.containsKey(key))
                {
                    cacheHit++;
                    score = memo.get(key);
                } else
                    score = solve(n, day + 1, 'A', activities, memo) + activities[day][0];
                activity = 'A';
            }
            if (prev != 'B')
            {
                int scoreB;
                Key key = new Key(day, 'B');
                if (memo.containsKey(key))
                {
                    scoreB = memo.get(key);
                    cacheHit++;
                } else
                    scoreB = solve(n, day + 1, 'B', activities, memo) + activities[day][1];

                if (score < scoreB)
                {
                    score = scoreB;
                    activity = 'B';
                }
            }
            if (prev != 'C')
            {
                int scoreC;
                Key key = new Key(day, 'C');
                if (memo.containsKey(key))
                {
                    cacheHit++;
                    scoreC = memo.get(key);
                } else
                    scoreC = solve(n, day + 1, 'C', activities, memo) + activities[day][2];
                if (score < scoreC)
                {
                    score = scoreC;
                    activity = 'C';
                }
            }
            memo.put(new Key(day, activity), score);
            return score;
        }

    }

    static class Key
    {
        int day;
        char activity;

        Key(int day, char activity)
        {
            this.day = day;
            this.activity = activity;
        }

        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return day == key.day && activity == key.activity;
        }

        public int hashCode()
        {
            return Objects.hash(day, activity);
        }

    }

    static class CPUtils
    {
        public static int[] readIntArray(int size, Scanner in)
        {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextInt();
            }
            return array;
        }

    }
}

