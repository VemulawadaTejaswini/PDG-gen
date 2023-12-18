import java.util.Scanner;
class Main
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integers: ");
        String in=sc.next();
        in+=sc.nextLine();
        int r=in.charAt(0);
        int g=in.charAt(1);
        int b=in.charAt(2);
        int number=(r*100)+(g*10)+b;
        if(number%4==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}