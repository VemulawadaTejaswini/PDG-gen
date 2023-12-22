import java.util.Scanner;
public class Main {
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double r;
r=sc.nextDouble();
double f,n;
f=Math.PI*r*r;
n=Math.PI*2*r;
System.out.format("%.6f",f);
System.out.print(" ");
System.out.format("%.6f", n);
sc.close();
}
}
