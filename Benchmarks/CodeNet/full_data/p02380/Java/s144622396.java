import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Triangle triangle = new Triangle();
 
        System.out.printf("%f",triangle.triangleArea(a,b,c));
        System.out.println();
        System.out.printf("%f", triangle.triangleCircumference(a,b,c));
        System.out.println();
        System.out.printf("%f", triangle.triangleHeight(a,b,c));
    }
}
class Triangle{
    private int a;
    private int b;
    private int angle;
    
    public Triangle(){
        this.a = a;
        this.b = b;
        this.angle = angle;
    }
    public static double triangleArea(int a, int b,int angle){
        return (double)a * b * Math.sin(Math.toRadians(angle))/ 2;
    }
    public static double triangleCircumference(int a, int b, int angle){
        return(double)(a + b + Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.cos(Math.toRadians(angle))));
    }
    public static double triangleHeight(int a, int b,int angle){
        return (double) b * Math.sin(Math.toRadians(angle));
    }
}
