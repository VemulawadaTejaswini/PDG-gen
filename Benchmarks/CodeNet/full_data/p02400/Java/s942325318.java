import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		
		double r;
	
		r = scan.nextInt();
		
		System.out.println(r * r * Math.PI + " " + r * 2 * Math.PI);
		
	}

}