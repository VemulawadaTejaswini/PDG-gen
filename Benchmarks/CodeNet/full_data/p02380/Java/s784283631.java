import java.util.Scanner;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double degree = scanner.nextDouble();
 
        double S = 0.5*a*b*Math.sin(Math.PI*degree/180.0);
        double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.PI*degree/180.0));
 
        System.out.printf("%.10f\n",S);
        System.out.printf("%.10f\n", a+b+c);
        System.out.printf("%.10f\n", 2*S/a);
    }
}
