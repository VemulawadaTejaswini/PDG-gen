import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int[] input = new int[2];
        for(int i = 0; i < 2; i++)
        {
            input[i] = keyboard.nextInt();
        }
        int length = input[1];
        int[] houses = new int[length];
        int sum = 0;
        for(int j =0; j< length; j++)
        {
            houses[j] = keyboard.nextInt();
            

        }

        for (int k =0; k<length-1; k++)
        {
            if(houses[k] == 0)
                continue;
            else
                sum = sum + (houses[k+1] - houses[k]);
        }

        System.out.println(sum);
    }
}
      
       