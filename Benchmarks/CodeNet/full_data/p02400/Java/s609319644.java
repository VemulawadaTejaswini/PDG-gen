import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int r;
		r=scan.nextInt();
		double S=r*r*Math.PI;
		double i=2*r*Math.PI;
		
		System.out.println(S+" "+i);
		
		
	}

}

