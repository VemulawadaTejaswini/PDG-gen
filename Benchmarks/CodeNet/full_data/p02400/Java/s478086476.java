import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	Double r=sc.nextDouble();
	System.out.println(((double)r*(double)r*Math.PI)+" "+(double)r*2.0*Math.PI);
    }
}