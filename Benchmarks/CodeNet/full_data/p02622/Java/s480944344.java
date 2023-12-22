import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String s1 =read.next() , s2=read.next();
        int count=0;
        for (int i=0 ; i<s1.length() ; i++)
        {
            if (s1.charAt(i) == s2.charAt(i))
            {
                continue;
            }
            else {
                 count++;
             }
        }
        System.out.println(count);
    }
}