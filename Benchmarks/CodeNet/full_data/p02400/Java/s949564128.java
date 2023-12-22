import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		
		float r;
	
		r = scan.nextFloat();
		
		System.out.println(String.format("%.6f", r * r * Math.PI) + " " + String.format("%.6f", r * 2 * Math.PI));
		
	}

}