
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int c = sc.nextInt();
        double area = (a*b*Math.sin(Math.toRadians(c)))/2;
        double height = b*Math.sin(Math.toRadians(c));
        double length = a+b+(Math.sqrt(height*height + (a-b*Math.cos(Math.toRadians(c)))*(a-b*Math.cos(Math.toRadians(c)))));
        System.out.println(area);
        System.out.println(length);
        System.out.println(height);
    }
}

