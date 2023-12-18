import java.util.Scanner;
class Main
{
 public static void main(String[] args)
    {
        int m1;
        int d1;
        int m2;
        int d2;
        Scanner scan1 = new Scanner(System.in);
        m1 = scan1.nextInt();
        d1 = scan1.nextInt();
        m2 = scan1.nextInt();
        d2 = scan1.nextInt();
        
        if(m1 == 2 || m1==4 || m1==6 || m1==9 || m1==11)
            if(d1 == 30)
                System.out.println('1');
             else
                 System.out.println('0');
        
        else
            if(m1 == 31)
               System.out.println('1');
            else
                System.out.println('0');
    }
}