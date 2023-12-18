import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, modNum = -1;
        String yesNo;

        n = sc.nextInt();

        for(int i = 1; i < 10; i++)
        {
            modNum = n % i;
            if(modNum == 0 && (n/i) <= 9)
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}