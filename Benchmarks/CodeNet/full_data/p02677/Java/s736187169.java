import java.util.Scanner;
public class Main {
    public static double pie= 3.14159265358979323846264338327950;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        int h =sc.nextInt();
        int m =sc.nextInt();
        double  rad=pie*2*((double ) h / 12.0 + ((double ) m / 60.0) / 12.0 - (double) m / 60.0);
        double  rsq =  ((double) (a * a + b * b) - (double ) (2 * a * b) * Math.cos(rad));
        System.out.println(Math.sqrt(rsq));






    }
}



