import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int r=scan.nextInt();
double a=(double)r*(double)r*3.141592653589;
double b=(double)r*2.0*3.141592653589;
System.out.printf("%f %f\n",a,b);
}
}