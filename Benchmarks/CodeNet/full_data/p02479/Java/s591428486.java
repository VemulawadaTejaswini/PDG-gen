import java.util.Scanner;
import java.io.*;

public class Main{

	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			String str=scan.next();
			double r=Double.parseDouble(str);
			if(r<0){
				r=0;
			}
			double P=Math.PI;
			String a=String.format("%.6f",r*r*P);
			System.out.print(a);
			System.out.print(" ");
			String b=String.format("%.6f",2*r*P);
			System.out.print(b);
        } catch (NumberFormatException e) {
            System.out.println("nono");
        }
	}

}