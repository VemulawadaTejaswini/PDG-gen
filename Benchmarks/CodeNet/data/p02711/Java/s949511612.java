import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String s[] = new String[3];
        String nn = String.valueOf(n);
        for (int i  = 0;i<nn.length();++i) s[i] = nn.substring(i,i+1);

        boolean sw = false;
        for (int i = 0;i<s.length;++i)
        {
            if (s[i].equals("7"))
            {
                sw = true;
                break;
            }
        }
        if (sw) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}