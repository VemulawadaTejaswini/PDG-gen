import java.util.*;
import java.lang.Math;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		double a = in.nextInt();
		double b = in.nextInt();
		for(int i=0;i<=1000;i++){
			double x = Math.floor(i*0.08);
			double y = Math.floor(i*0.1);
			if(x==a && y==b){
				System.out.print(i);
				break;
			}
			else if(i==1000){
				System.out.print("-1");
			}
			
		}
	}
}