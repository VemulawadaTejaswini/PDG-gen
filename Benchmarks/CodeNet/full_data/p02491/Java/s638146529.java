import java.io.*;
import java.util.*;
class Main{
	public static void print(Object o){
		System.out.println(o);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i1 = in.nextInt();
		int i2 = in.nextInt();
		print(i1/i2 + " " + i1%i2 + " " + (double)i1/(double)i2);
	}
}