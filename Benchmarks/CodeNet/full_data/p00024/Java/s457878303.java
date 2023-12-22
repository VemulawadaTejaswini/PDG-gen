import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		float v = scan.nextFloat();
		double t = v / 9.8;
		double y = 4.9 * Math.pow(t,2);
		int i=1;
		while(true){
			if(5*(i-1)>=y){System.out.println(i);break;}
			i++;
		}
	}
	}
}