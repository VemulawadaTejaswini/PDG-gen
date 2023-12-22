import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); String s = "";
        while (n > 0) {
            int mod = (int) n % 26 + 96;
            s =  Character.toString((char)mod) + s;
            n /= 26;
        }
        System.out.println(s);
    }


}