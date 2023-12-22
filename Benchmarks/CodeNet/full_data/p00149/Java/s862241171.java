import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int left[] = new int[4];
		int right[] = new int[4];
		double[] border ={0.2,0.6,1.1,3};
		for(;sc.hasNextDouble();){
			double l = sc.nextDouble();
			int i = 0;
			for(;border[i] < l;i++){
			}
			
			left[i]++;
			double r = sc.nextDouble();
			i = 0;
			for(;border[i] < r;i++){
			}
			right[i]++;
		}
		for(int i = 3; i >= 0; i--){
			System.out.println(left[i] + " "+ right[i]);
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}