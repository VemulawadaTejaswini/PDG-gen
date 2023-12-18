import java.util.Scanner;

public class Day4H
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();

        int cnt = 0;
        for(int i = 0; i <= k; i++)
            for(int j = 0; j <= k; j++)
                for(int l = 0; l <= k; l++)
                    if(i + j + l == s)
                        cnt++;
        System.out.println(cnt);
    }
}
