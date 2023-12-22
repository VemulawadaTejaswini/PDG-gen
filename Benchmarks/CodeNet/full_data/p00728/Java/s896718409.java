import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ1147();
	}
	class AOJ1147{
		public AOJ1147() {
			while (true) {
				int n = in.nextInt();
				if(n==0)break;
				int sum = 0;
				int max = -999;
				int min = Integer.MAX_VALUE/2;
				for(int i=0;i<n;i++){
					int input = in.nextInt();
					sum+=input;
					max = Math.max(max,input);
					min = Math.min(min,input);
				}
				sum-=max;sum-=min;
				n-=2;
				System.out.println(sum/n);
			}
			
		}
	}
}