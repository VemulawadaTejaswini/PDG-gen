import java.lang.Math;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	double r,s,shu;
	Scanner scan=new Scanner(System.in);
	r=scan.nextFloat();
	s=r*r*Math.PI;
	shu=2*r*Math.PI;
	System.out.println(s+" "+shu);
    }
}