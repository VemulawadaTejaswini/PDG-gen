import java.util.Scanner;
public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
double pi = Math.PI; 
double r = sc.nextInt();
//int b = sc.nextInt();
double area = r*r*pi;
double length = 2*r*pi;
System.out.printf("%f %f", area, length);
}
}
