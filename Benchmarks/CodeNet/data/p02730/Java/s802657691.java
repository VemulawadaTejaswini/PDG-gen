import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        String txt;


        Scanner sc = new Scanner(System.in);
        txt = sc.nextLine();
        if(palindrome(txt))
        {
            String firstHalf = txt.substring(0,(txt.length()-1)/2);
            if(palindrome(firstHalf))
            {
                String secondHalf = txt.substring((txt.length()+3)/2-1,txt.length());
                if(palindrome(secondHalf))
                {
                    System.out.print("Yes");
                }
                else
                {
                    System.out.print("No");
                }
            }
            else
            {
                System.out.print("No");
            }
        }
        else
        {
            System.out.print("No");
        }
    }

    public static boolean palindrome(String word)
    {
        String copy = "";
        for(int i = word.length(); i > 0; i--)
        {
            copy += word.substring(i-1,i);
        }
        if(word.equals(copy))
        {
            return true;
        }
        return false;
    }
}
