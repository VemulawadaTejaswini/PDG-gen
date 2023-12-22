import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	double r = in.nextDouble();
	double area = r*r*Math.PI;
	double length = 2*r*Math.PI;
	    
	System.out.println(String.format("%.5f %.5f",area,length));
    }
}

