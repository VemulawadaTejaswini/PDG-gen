import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double r2 = 1.0*r;
		
		double ensyu = r*2*3.141592653589;
		double menseki = r*r*3.141592653589;

		String ee =String.format("%.8f",ensyu);
		String mm =String.format("%.8f",menseki);
		System.out.println(ee+" "+mm);
	}
}