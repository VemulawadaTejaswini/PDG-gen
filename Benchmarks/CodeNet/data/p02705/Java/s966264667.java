import java.util.Scanner;
class Circumference {
static Scanner sc = new Scanner (System.in);
public static void main (String args []){
System.out.println ("Enter the radius: ");
double radius = sc.nextDouble();
double Circumference = Math.PI * 2 *radius;
System.out.println(" The Circumference of the circle is : "+ Circumference);
}
}