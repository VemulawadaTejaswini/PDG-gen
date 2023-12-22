import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double S = (double)a * b * Math.sin(Math.toRadians((double)c)) / 2;
        double _c = Math.sqrt(a * a + b * b - 2 * (double)a * b * Math.cos(Math.toRadians((double)c)));
        double L = a + b + _c;
        double h = (double)b * Math.sin(Math.toRadians((double)c));
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
}
