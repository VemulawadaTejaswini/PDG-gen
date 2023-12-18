import java.util.Scanner;

public class Main
{
    public static boolean checkPalindrome(String s)
    {
        // reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();

        // check whether the string is palindrome or not
        if (s.equals(reverse))
           return true;

        else
          return false;
    }

    public static void main (String[] args)
    {

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int len = s.length();
        int ans = 2*len;
        ans = ans -1;

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(checkPalindrome(s.substring(i,j+1))){
                    ans -= 1;
                }
            }
        }

        System.out.println(ans);
    }


} 