package Math;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class circumference_Circle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R=in.nextInt();
		in.close();
		double result=(2*Math.PI)*R;
		System.out.println(result);
	}

}
