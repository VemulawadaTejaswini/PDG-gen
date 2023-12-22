import java.text.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stringer[][] field = new Stringer[3][8];
        for(int i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 8; ++j)
            {
                field[i][j] = new Stringer(sc.nextInt(), sc.nextDouble());
            }
        }

        for(Stringer[] track : field)
        {
            Arrays.sort(track);
            System.out.println(track[0].toString());
            System.out.println(track[1].toString());
        }

        Stringer[] allRank = new Stringer[6];
        for(int i = 0; i < 3; ++i)
        {
            allRank[i * 2]     = field[i][2];
            allRank[i * 2 + 1] = field[i][3];
        }

        Arrays.sort(allRank);
        System.out.println(allRank[0]);
        System.out.println(allRank[1]);
    }
}

final class Stringer implements Comparable<Stringer>
{
    Stringer(final int i, final Double t)
    {
        this.id = i;
        this.time = t;
    }

    @Override
    public int compareTo(final Stringer s)
    {
        return this.time.compareTo(s.time);
    }

    @Override
    public String toString()
    {
        return String.valueOf(id) + " " + String.valueOf(time);
    }

    private final int id;
    private final Double time;
}