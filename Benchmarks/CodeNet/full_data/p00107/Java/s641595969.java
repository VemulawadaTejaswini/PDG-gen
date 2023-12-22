
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int loopCount = 0;
        int[] CheeseSize = null;
        int X = 0, Y = 1, Z = 2;
        String inputedStr;
        Scanner sc = new Scanner(System.in);
        while ( !"0 0 0".equals(inputedStr = sc.nextLine()) )
        {
            if ( loopCount == 0 )
            {
                CheeseSize = strToIntArray(inputedStr);
            }
            else
            {
                int R = Integer.parseInt(inputedStr);
                if ( CheeseSize[X] < R || CheeseSize[Y] < R || CheeseSize[Z] < R )
                {
                    System.out.println("OK");
                }
                else
                {
                    System.out.println("NA");
                }
            }
            loopCount++;
        }
    }

    public static int[] strToIntArray(String s)
    {
        int i = 0;
        int[] data = null;
        String[] str = s.split(" ");
        data = new int[str.length];
        for ( String a : str )
        {
            data[i] = Integer.parseInt(a);
            i++;
        }
        return data;
    }
}