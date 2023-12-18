

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Main m = new Main();
        m.p4();
    }

    public void p4()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String input = scan.nextLine();
        char[] c = input.toCharArray();
        int ans = 0;
        char _i,_j,_k;
        for(int i = 0; i < c.length; i++)
        {
            for(int j = i+1; j < c.length; j++)
            {
                for(int k = j+1; k < c.length; k++)
                {
                    if(j - i == k - j)continue;
//                    _i = c[i];
//                    _j = c[j];
//                    _k = c[k];
                    if(c[i] != c[j] && c[j] != c[k] && c[i] != c[k])ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
