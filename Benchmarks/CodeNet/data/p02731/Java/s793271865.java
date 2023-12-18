import java.util.*;
import java.util.Scanner;

public class Vol
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        key.close();
        double volume = num/3;
        System.out.println(volume*volume*volume);
        
    }
}