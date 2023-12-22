import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Triangle tri = new Triangle(scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(tri.getArea());
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getHeight());
			
	}

}
class Triangle{
	int a;
	int b;
	int c;
	public Triangle(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double getArea(){
		return a*b*Math.sin(Math.toRadians(c));
	}
	double getPerimeter(){
		return a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)));
	}
	double getHeight(){
		return b*Math.sin(Math.toRadians(c));
	}

}