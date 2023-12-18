import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        long num = key.nextInt();
        long blue = key.nextInt();
        long red = key.nextInt();

        if(blue %2 != 0)
        {
            blue = blue + 1;
        }    
            
        System.out.println(blue);
        

        

        
    }
}