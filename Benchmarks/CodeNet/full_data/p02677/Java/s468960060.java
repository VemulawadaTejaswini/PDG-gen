import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int hm = h*60 + m;

        System.out.println(Math.sqrt((double)a*a + (double)b*b - 2.0*a*b*Math.cos(Math.toRadians((double)hm/(12.0*60.0)*360.0 - (double)m/60.0*360.0))));
    }
}