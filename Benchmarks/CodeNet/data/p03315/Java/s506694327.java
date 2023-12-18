import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String str[] = S.split("");
        int sum = 0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals("+"))
            {
                sum++;
            }
            else if(str[i].equals("-"))
            {
                sum--;
            }
        }
        System.out.println(sum);
    }
}
