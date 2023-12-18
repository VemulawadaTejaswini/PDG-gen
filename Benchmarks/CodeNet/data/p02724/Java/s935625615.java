import java.util.*;
 
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int fiveHundred = X/500;
        X -= fiveHundred*500;
        int five = X/5;
        System.out.println(fiveHundred*1000+five*5);
    }
}