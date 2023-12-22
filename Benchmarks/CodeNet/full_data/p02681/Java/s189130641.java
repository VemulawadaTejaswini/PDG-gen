import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String s[] = S.split("");
        String T = sc.next();
        String t[] = T.split("");
        int sum = 0;
        for(int i=0;i<S.length();i++)
        {
            if(s[i].equals(t[i]))
            {
                sum++;
            }
        }
        if(sum== S.length())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
