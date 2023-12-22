import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	double r = sc.nextDouble();
	
	double area = Math.PI * (double)r * (double)r; 
        double cir = Math.PI * 2 * (double)r ;
	
	System.out.printf("%6f",area);
	System.out.printf(" ");
	System.out.printf("%6f\n",cir);	
  }
	


}