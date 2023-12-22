
import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double x=sc.nextDouble();
			double h=sc.nextDouble();
			System.out.printf("%6f\n",x*x+2*x*Math.sqrt(h*h+x*x/4));
		}
	}
}