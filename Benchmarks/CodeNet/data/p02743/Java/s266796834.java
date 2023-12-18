import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
    double l=a*a+2*a*b+b*b;
    if(l<c*c) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
