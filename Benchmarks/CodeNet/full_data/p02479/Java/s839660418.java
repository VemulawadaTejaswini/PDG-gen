import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	double x = cin.nextDouble();
	double pai=Math.PI;
	System.out.printf("%f %f\n",x*x*pai,2*x*pai);
    }
}