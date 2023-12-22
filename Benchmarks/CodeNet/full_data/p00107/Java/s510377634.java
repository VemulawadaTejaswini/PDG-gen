
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
                loopCount = 1;
            }
            else
            {
                int R = Integer.parseInt(inputedStr);
                if ( CheeseSize[X] < R * 2 || CheeseSize[Y] < R * 2 || CheeseSize[Z] < R * 2 )
                {
                    System.out.println("OK");
                }
                else
                {
                    System.out.println("NA");
                }
            }

        }
    }

    public static int[] strToIntArray(String s)
    {
        int i = 0;
        int[] data = new int[3];
        String[] str = s.split(" ");
        for ( String a : str )
        {
            data[i] = Integer.parseInt(a);
            i++;
        }
        return data;
    }
}