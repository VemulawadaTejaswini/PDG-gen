import java.util.*;
public class EasyMod {
    public static void main (String args[])
    {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt(), b = cin.nextInt();
        if ((a*b) % 2 == 0) {
            System.out.print("Even");
        }
        else {
            System.out.print("Odd");
        }
    }
}