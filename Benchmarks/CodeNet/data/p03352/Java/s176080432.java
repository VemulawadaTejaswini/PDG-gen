import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int num = 1;

        for(int i = 10; i > 1; i--)
        {
            for(int j = 2; j < 40; j++)
            {
                double tmp = Math.pow(j,i);
                if(tmp <= x) num = (int) tmp;
            }
        }
        System.out.print(num);
        scan.close();
    }
}