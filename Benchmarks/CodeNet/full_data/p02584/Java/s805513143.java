import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        long Total = Math.abs(readLong());
        long Moves = readLong();
        long AmountOneMove = readLong();

        if (Total / AmountOneMove <= Moves)
        {
            long remainingSteps = Moves - Total / AmountOneMove;
            System.out.println(Math.abs(remainingSteps % 2 == 0 ? Total % AmountOneMove : Total % AmountOneMove - AmountOneMove));
        }
        else
            System.out.println(Total - Moves * AmountOneMove);
    }


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static long readLong() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
        {
            st = new StringTokenizer(br.readLine());
        }
        return Long.parseLong(st.nextToken());
    }
}