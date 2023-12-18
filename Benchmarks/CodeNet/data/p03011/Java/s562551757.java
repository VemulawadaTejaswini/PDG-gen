import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int p = scan.nextInt();
      	int q = scan.nextInt();
      	int r = scan.nextInt();
      	int ab = p + q;
      	int bc = q + r;
      	int ca = r + q;
      	if(ab > bc){
        	if(ab > ca) {
            	System.out.print(ab);
            }
          	else {
            	System.out.print(ca);
            }
        }
      	else if(bc > ab){
        	if(bc > ca){
            	System.out.print(bc);
            }
          	else {
            	System.out.print(ca);
            }
        }
    
    }


}