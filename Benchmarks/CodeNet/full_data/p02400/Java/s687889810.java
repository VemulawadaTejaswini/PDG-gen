import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    double a = Double.parseDouble( scan.next());
	    double pi=Math.PI;
	    
	    double area = a * a * pi;
	    double length = 2 * a * pi;
	    
	    System.out.println(area + " "+ length);
 
	}
}