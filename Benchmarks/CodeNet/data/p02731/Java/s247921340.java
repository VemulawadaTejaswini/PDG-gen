import java.util.Scanner;


public class Vol
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        double num = key.nextInt();
        key.close();
        
        System.out.println((num/3)*(num/3)*(num/3));
        
    }
}