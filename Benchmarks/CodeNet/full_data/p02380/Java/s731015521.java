import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int C = sc.nextInt();
        double S = a * b * Math.sin(Math.toRadians(C)) / 2.0;
        double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(C)));
        double L = a + b + c;
        double h = 2*S / a;
        System.out.println(S + " " + L + " " + h);
    }
}
