import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        double area = r*r*Math.PI;
        double length = 2.0*r*Math.PI;
        System.out.print(String.format("%.5f",area) + " ");
        System.out.print(String.format("%.5f",length));
    }
}
