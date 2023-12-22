import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		double x=stdIn.nextDouble();
		System.out.println((x*x*Math.PI)+" "+(2*x*Math.PI));
	}
}