import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	int r = sc.nextInt();
	double area = (double)r * (double)r * Math.PI; 
        double cir = 2 * (double)r * Math.PI;
	
	System.out.printf("%7f",area);
	System.out.printf(" ");
	System.out.printf("%7f\n",cir);	
  }
	


}