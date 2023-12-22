import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = (double)a/(double)b;
	
		System.out.print((a/b)+" ");
		System.out.print((a%b)+" ");
		System.out.println(c);
	}
}