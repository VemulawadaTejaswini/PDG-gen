import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		double a = L/3;
		double b = (L-a)/2;
		double c = L - a - b ;
		double valume = (a*b*c)/1;
		System.out.println(valume);
	}
}
