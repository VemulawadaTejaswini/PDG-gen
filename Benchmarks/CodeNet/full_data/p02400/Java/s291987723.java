import java.util.Scanner;
import java.util.InputMismatchException;


class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
try{
double r=scan.nextDouble();
double a=r*r*3.141592653589;
double b=r*2.00000000*3.141592653589;
System.out.printf("%f %f\n",a,b);
}catch (InputMismatchException e){
      System.out.println("?????????????????????" + e);
    }

}
}