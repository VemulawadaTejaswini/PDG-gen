import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	double r = in.nextInt();
	double Phi = 3.14159265358979;       

	System.out.printf("%.6f %.6f\n" ,Phi*r*r ,2*Phi*r);
    }
}