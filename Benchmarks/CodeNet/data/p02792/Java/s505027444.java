import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int i = 1;
            long count = 0;
            while (i < N)
            {
                String s = Integer.toString(i);
                if (s.charAt(s.length() - 1) == '0')
                {
                    i++;
                    continue;
                }
                // 1 case
                if (s.length() == 1) count++;

                char first = s.charAt(0);
                char last = (s.length() == 1) ? s.charAt(0) : s.charAt(s.length() - 1);
                // 11 case
                if (s.length() >= 2 && first != '0' && first == last) count++;

                String[] append = {"", "9", "99", "999", "9999", "99999"};
                for (int j = 0; j < 5; j++)
                {
                    String n = new StringBuilder().append(last).append(append[j]).append(first).toString();
                    if (Integer.parseInt(n) < N)
                    {
                        count += Math.pow(10, j);
                    } else if (n.length() == Integer.toString(N).length())
                    {
                        int z = 0;
                        StringBuilder sb = new StringBuilder().append("%0").append(j).append("d");
                        while (Integer.parseInt(String.format(sb.toString(), z)) <= Integer.parseInt(append[j]))
                        {
                            if (Integer.parseInt(new StringBuilder().append(last).append(String.format(sb.toString(), z)).append(first).toString()) < N)
                            {
                                count++;
                            } else
                                break;
                            z++;
                        }
                    }
                }
                i++;
            }
            out.print(count);
        }

    }
}

