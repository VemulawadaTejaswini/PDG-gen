import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        boolean no_exist = true;
        for( int i = 0; i < s.length()-1; i++)
        {
            if( s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T' )
            {
                no_exist = false;
                break;
            }
        }

        if (no_exist)
        {
            System.out.println(0);
            System.exit(0);
        }


        Pattern p = Pattern.compile("[A|C|G|T]+");
        Matcher m = p.matcher(s);
        int max_len = 0;
        while (m.find()) {
            if (m.group().length() > max_len){
                max_len = m.group().length();
            }
        }
        System.out.println(max_len);
    }
}