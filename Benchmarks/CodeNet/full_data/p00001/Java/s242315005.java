import java.util.*;

public class Main
{

    public static void main(String[ ] args)
    {

        Scanner input = new Scanner(System.in);
        int mountain[] = new int [10];
        int largest[] = new int[] {0, 0, 0};
        int i = 0;

        while (i < 10)
        {
            mountain[0] = input.nextInt();
            i++;
        }

          for (int k = 0; k < 10; k++)
          {
            if (mountain[k] > largest[1])
            {
                largest[1] = mountain[k];
            }
          }

          for (int k = 0; k < 10; k++)
          {
            if (mountain[k] <= largest[1] && mountain[k] > largest[2])
            {
                largest[2] = mountain[k];
            }
          }

          for (int k = 0; k < 10; k++)
          {
            if (mountain[k] <= largest[1] && mountain[k] <= largest[2] && mountain[k] > largest[3])
            {
                largest[3] = mountain[k];
            }
          }

          for (int j = 0; j < 3; j++)
          {
            System.out.println(largest[j]);
          }
    }
}