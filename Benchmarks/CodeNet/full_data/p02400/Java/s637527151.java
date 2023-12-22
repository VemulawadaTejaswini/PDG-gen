import java.util.Scanner;

public class Main{

    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);

	double r = scan.nextDouble();

	System.out.println(((double)r*r*Math.PI)+" "+((double)2*r*Math.PI));
    }
}