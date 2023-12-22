import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		int a = in1.nextInt();
		int b = in2.nextInt();
		int c = a*b;
		a *= 2;
		b *= 2;
		a += b;
		System.out.println(c + " " + a);
	}
}