import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int r=scan.nextInt();
double a=(double)r*(double)r*Math.PI;
double b=(double)r*2.00000000*Math.PI;
System.out.printf("%f %f\n",a,b);
}
}