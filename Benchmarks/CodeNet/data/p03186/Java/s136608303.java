import java.io.IOException;
import java.util.Arrays;

public class Foo{
    public static void main(String[] args) throws IOException
    {

        Integer[] abc =
            Arrays.stream(args).map(x -> Integer.parseInt(x)).toArray(Integer[]::new);

        if (abc[2] < abc[0] + abc[1])
        {
            System.out.println(abc[2] * 2);
        }
        else
        {
            System.out.println(abc[0] + 2 * abc[1]);
        }
    }
}
