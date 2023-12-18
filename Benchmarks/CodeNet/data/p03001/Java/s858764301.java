import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int width = scan.nextInt();	
      	int height = scan.nextInt();
      	int x = scan.nextInt();
      	int y = scan.nextInt();
      	double yoko = 0.000000;//y
      	double tate = 0.000000;//x
      	int mi = 0;
        yoko = yoko + Math.min(width * (height - y), width * y);
      	tate = tate + Math.min(height * (width - x), height * x);

      	System.out.print(width * height / 2.0);
      	if(yoko == tate) {
        	mi = 1;
        }
      	System.out.print(" " + mi);
    
    }
 
 
}