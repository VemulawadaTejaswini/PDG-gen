import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	double a,b,c,d,e,f,x,y;
    	Scanner in = new Scanner(System.in);
    	while(true){
    		try{
    			a=in.nextDouble();
    			b=in.nextDouble();
    			c=in.nextDouble();
    			d=in.nextDouble();
    			e=in.nextDouble();
    			f=in.nextDouble();
    			y=(a*f-c*d)/(-b*d+e*a);
        		x=(c-b*y)/(a);
        		System.out.printf("%.3f %.3f\n",x,y);
    		}
    		catch (Exception g){
    			System.exit(0);
    		}
    	}
    }
}