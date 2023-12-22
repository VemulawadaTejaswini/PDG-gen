import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Main
{
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }
    public static void main (String[] args) {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(lcm(360, n) / n);
    }
}
