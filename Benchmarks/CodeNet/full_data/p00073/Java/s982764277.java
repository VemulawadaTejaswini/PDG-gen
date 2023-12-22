import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    double x = sc.nextDouble();
	    double h = sc.nextDouble();
	    if(x==h && x==0) break;
	    double l = Math.sqrt((x/2)*(x/2)+h*h);
	    System.out.println(x*x + (x*l/2)*4);
	}
    }
}
			       