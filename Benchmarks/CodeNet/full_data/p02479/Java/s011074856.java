import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		
		System.out.println((r*r*3.141592) + " " + (2*3.141592*r));
	}	
}