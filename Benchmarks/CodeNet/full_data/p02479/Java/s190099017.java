import java.util.Scanner;

public class main10009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str=scan.next();
		int r=Integer.parseInt(str);
		double P=Math.PI;
		System.out.print(r*r*P);
		System.out.print(" ");
		System.out.println(2*r*P);
	}

}