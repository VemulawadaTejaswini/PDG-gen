import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- > 0){
			int x = 0, y = 0;
			double max = Double.MIN_VALUE;
			int maxX = -1, maxY = -1;

			while(true){
				int tx = sc.nextInt(), ty = sc.nextInt();
				if(tx == 0 && ty == 0) break;

				x += tx;
				y += ty;

				double dist = Math.sqrt(x*x + y*y);
				if(dist > max || dist == max && x > maxX){
					max = dist;
					maxX = x;
					maxY = y;
				}
			}

			System.out.println(maxX + " " + maxY);
		}
	}
}