import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    double b=sc.nextDouble();
    double x=a*b;
    double y=a*b*100;
    double z=y%100;
    
    if(z<50){
    	System.out.printf("%1.0f",x);
    }else{
    	double X=x-1;
    	System.out.printf("%1.0f",X);
    }
  }
}