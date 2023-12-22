import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{

    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.000000");
	double r = scan.nextDouble();
	double S,L;

	S = Math.pow(r,2) * Math.PI;
	L = 2 * r * Math.PI;
	System.out.println(df.format(S)+" "+df.format(L));
    }
}