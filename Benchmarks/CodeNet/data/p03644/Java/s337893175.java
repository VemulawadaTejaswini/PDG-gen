import java.util.Scanner;
class Break_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=0;
        while((int)(Math.pow(2,i))<=n)
        {
            i++;
        }
        i--;
        System.out.println((int)(Math.pow(2,i)));
    }
}
        