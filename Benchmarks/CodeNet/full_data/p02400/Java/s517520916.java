import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = r*r*Math.PI;
        double l = 2*r*Math.PI;
        System.out.printf("%.6f %.6f",s,l);
        sc.close();
    }
}
