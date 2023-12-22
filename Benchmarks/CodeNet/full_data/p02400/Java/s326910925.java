import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double r2 = 1.0*r;
		
		double ensyu = r2 * 2 * 3.141592653589;
		double menseki = r2 * r2 * 3.141592653589;

		String ee =String.format("%.8f",ensyu);
		String mm =String.format("%.8f",menseki);
		System.out.println(mm+" "+ee);
	}
}