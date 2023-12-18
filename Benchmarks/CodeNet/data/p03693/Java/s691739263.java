import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<1000&&number>110&&number%4==0&&number%100!=0&&number%10!=0)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}