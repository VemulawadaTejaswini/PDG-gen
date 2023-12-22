import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		System.out.println(String.format("%.5f",r*r*3.14)+" "+String.format("%.5f",(r+r)*3.14));
	}
	}