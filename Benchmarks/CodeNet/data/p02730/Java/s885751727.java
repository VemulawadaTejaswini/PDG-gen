
import java.util.Scanner;


public class Main 
{
    static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j) 
        { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean v = isPalindrome(s);
        String n = s.substring(0, ((s.length()-1)/2));
        boolean t = isPalindrome(n);
        String p = s.substring(((s.length()+3)/2)-1, s.length());
        boolean b = isPalindrome(p);
        if(v==true&&t==true&&b==true)
        {
            System.out.println("Yes");
        } 
        else
        {
            System.out.println("No");
        }
    }
}
