import java.util.Scanner;

public class Main {

    public static int a,b,c,Min;
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        if(a+b<=a+c) Min=a+b;
        if(b+c<=Min) Min=b+c;

        System.out.println(Min);
    }
}
