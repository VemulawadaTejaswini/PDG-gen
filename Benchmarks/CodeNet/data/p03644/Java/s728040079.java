import java.util.Scanner;
public class Break_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        outer:while(true)
        {
            n=sc.nextInt();
            if(n>100)
            continue;
            else
            break outer;
        }
        int i=0;
        while((int)(Math.pow(2,i))<=n)
        {
            i++;
        }
        i--;
        System.out.println((int)(Math.pow(2,i)));
    }
}
        