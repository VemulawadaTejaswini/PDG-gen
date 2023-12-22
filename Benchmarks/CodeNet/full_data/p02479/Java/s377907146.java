import java.util.Scanner;
public class Circle {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
double r = sc.nextInt();
double area = r*r*Math.PI;
double length = 2*r*Math.PI;
System.out.println(area + " " + length);
}
}