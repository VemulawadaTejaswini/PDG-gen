import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
String R=scan.next();
double r=Double.parseDouble(R);
double a=r*r*3.141592653589;
double b=r*2.0*3.141592653589;
System.out.printf("%f %f\n",a,b);
}
}