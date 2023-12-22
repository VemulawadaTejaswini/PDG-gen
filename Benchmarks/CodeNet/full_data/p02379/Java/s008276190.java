import java.util.Scanner;

public class Main { 
  public static void main(String[] args){
//	  int x_1,y_1;
//	  int x_2,y_2;
	  double a=0;
	  double b=0;
	  double c=0;
	  double d=0;
	  Scanner sc = new Scanner(System.in);
	  int x_1 = sc.nextInt();
	  int y_1 = sc.nextInt();
	  int x_2 = sc.nextInt();
	  int y_2 = sc.nextInt();
	  
	  a = (x_1 - x_2)*(x_1 - x_2);
	  b = (y_1 - y_2)*(y_1 - y_2);
	  c = a + b;
	  d = Math.sqrt(c);
	  System.out.printf("%f",d);
	  
	  }
}

