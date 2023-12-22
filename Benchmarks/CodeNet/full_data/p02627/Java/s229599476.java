import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(0) < 97) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }


}