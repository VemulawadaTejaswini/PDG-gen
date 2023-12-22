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
		new AOJ1124();
	}
	class AOJ1124{
		public AOJ1124() {
			while(true){
				int n = in.nextInt();
				int q = in.nextInt();
				if(n+q==0)break;
				int[] memo = new int[200];
				for(int i=0;i<n;i++){
					int m = in.nextInt();
					for(int s=0;s<m;s++)memo[in.nextInt()]++;
				}
				int max = 0;
				int index = 0;
				for(int i=199;i>=0;i--){
					if(memo[i]>=max){
						max=memo[i];
						index=i;
					}
				}
				if(max>=q)System.out.println(index);
				else System.out.println("0");
				
			}
		}
	}
	
}