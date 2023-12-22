import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] cnt = new int[128];

        while (!str.isEmpty())
        {
            for (int i = 0; i < str.length(); i++)
            {
                cnt[str.charAt(i)]++;
            }
            str = scan.next();
        }

        for (int i = 'a', j = 'A'; i <= 'z'; i++, j++)
        {
            System.out.println((char)i + " : " + (cnt[i] + cnt[j]));
        }
    }
}