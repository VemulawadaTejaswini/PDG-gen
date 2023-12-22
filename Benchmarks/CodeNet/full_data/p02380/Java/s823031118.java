import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double side = Math.sqrt(((a * a) + (b * b)) - (2 * a * b * Math.cos(Math.toRadians(c))));
        double area = a * b * Math.sin(Math.toRadians(c)) / (double)2;

        System.out.printf("%.8f\n",area);
        System.out.printf("%.8f\n",a + b + side);
        System.out.printf("%.8f\n",area * 2 / a);

    }
}
