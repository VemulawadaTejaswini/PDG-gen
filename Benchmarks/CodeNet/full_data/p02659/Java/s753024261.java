import java.util.Scanner;

public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a =sc.nextLong();
        String s=sc.next();
        long b=(s.charAt(0)-'0')*100+(s.charAt(2)-'0')*10+(s.charAt(3)-'0');
        long c=(a*b)/100;
        System.out.println(c);

    }
}
