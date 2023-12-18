import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int N = sc1.nextInt();
        String S = sc2.nextLine();

        sc1.close();
        sc2.close();

        String s1 = S.substring(0, N/2);
        String s2 = S.substring(N/2, N);

        if(N >= 1)
        {
            if((N & 1) == 0)
            {
                if(s1.equals(s2))
                {
                    System.out.println("Yes");
                    return;
                }
                System.out.println("No");
                return;
            }
            System.out.println("No");
            return;
        }
        System.out.println("No");
    }
}