import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String temp;
		double r;
		double pi = Math.PI;
		try{
			temp = scan.next();
			r = Double.parseDouble(temp);
		}catch( IllegalStateException e ){
			System.out.println(e);
		}
		
		System.out.println();
		return;
	}
}