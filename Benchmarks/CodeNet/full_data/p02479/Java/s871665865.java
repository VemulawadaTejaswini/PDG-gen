import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	int x = cin.nextInt();
	double pai=Math.PI;
	double ans1=x*x*pai;
	double ans2=2*x*pai;
	System.out.printf("%f %f\n",ans1,ans2);
    }
}