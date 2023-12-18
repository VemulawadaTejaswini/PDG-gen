import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);     	
		int a = sc.nextInt();
		int b = sc.nextInt();
      	int x = sc.nextInt();
      	double area = a*a;
      	double volume = area*b;
      	double h=0,A=0,B=0;
      	if(x>volume)
        {
          System.out.println("0.0000000000");
        }
      	else
        {
          h = ((volume-x)/b);          
          A = Math.sqrt((a*a)+(h*h));
          B = Math.atan(h/a)*180/Math.PI;
      	  System.out.println(%.10,B);
        }
        
      
    }
}
