import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0594().doIt();
	}
	
	class AOJ0594{
		int w,h,n;
		
		long keisan(int ax,int ay,int bx,int by){
			int sx = bx-ax;
			int sy = by-ay;
			if(sx>=0&&sy>=0)return Math.max(sx, sy);
			else if(sx<=0&&sy<=0)return Math.max(-sx, -sy);
			else if(sx>0&&sy<0)return sx-sy;
			else return sy-sx;
		}
		
		void doIt(){
			w = in.nextInt();h = in.nextInt();n = in.nextInt();
			int sx = in.nextInt()-1,sy = in.nextInt()-1;
			long result = 0;
			for(int i=1;i<n;i++){
				int ax = in.nextInt()-1;
				int ay = in.nextInt()-1;
				result += keisan(sx,sy,ax,ay);
				sx = ax; sy = ay;
			}
			System.out.println(result);
		}
	}
	
}