import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Objects;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.math.BigInteger;
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
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int H = in.nextInt();
            int W = in.nextInt();
            char[][] matrix = new char[H][W];
            for (int i = 0; i < H; i++)
            {
                matrix[i] = in.next().toCharArray();
            }
            int x = H - 1;
            int y = W - 1;
            Map<Location, BigInteger> memo = new HashMap<>();
            Set<Location> visited = new HashSet<>();
            out.print(getNWays(x, y, matrix, memo, visited).mod(new BigInteger("1000000007")));
        }

        private BigInteger getNWays(int row, int column, char[][] matrix, Map<Location, BigInteger> memo, Set<Location> visited)
        {
            if (row == 0 && column == 0) return new BigInteger("1");
            if (memo.containsKey(new Location(row, column))) return memo.get(new Location(row, column));
            BigInteger ways = new BigInteger("0");
            int x[] = {-1, 0};
            int y[] = {0, -1};
            for (int i = 0; i < 2; i++)
            {
                if (isValid(row + x[i], column + y[i], matrix) && !visited.contains(new Location(row + x[i], column + y[i])))
                {
                    visited.add(new Location(row, column));
                    ways = ways.add(getNWays(row + x[i], column + y[i], matrix, memo, visited));
                    visited.remove(new Location(row, column));
                }
            }
            memo.put(new Location(row, column), ways);
            return ways;
        }

        boolean isValid(int row, int column, char[][] matrix)
        {
            return row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length && matrix[row][column] != '#';
        }

    }

    static class Location
    {
        int x;
        int y;

        Location(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Location location = (Location) o;
            return x == location.x &&
                           y == location.y;
        }

        public int hashCode()
        {
            return Objects.hash(x, y);
        }

    }
}

