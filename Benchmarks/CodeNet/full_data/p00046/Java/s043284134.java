//Volume0-0046
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		double h,
		       max = 0,
		       min = Double.MAX_VALUE;

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	h = sc.nextDouble();
        	if(max < h){max = h;}
        	if(min > h){min = h;}
        }
        System.out.println(max - min);
	}
}