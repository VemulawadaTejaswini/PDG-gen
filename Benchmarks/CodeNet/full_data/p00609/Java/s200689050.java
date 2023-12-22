import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public static class Point implements Comparable<Point>{
		short x, y;

		public Point(short x, short y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if(this.x != o.x){
				return this.x - o.x;
			}else{
				return this.y - o.y;
			}
		}
	}
	
	
	
	public static int check(final int R, Point[] enemys, Point[] bullets){
		final int LIM = 16 * R * R;
		
		int sum = 0;
		for(Point enemy : enemys){
			
			for(Point bullet : bullets){
				if(enemy.x - bullet.x > 4 * R){
					break;
				}else if(bullet.x - enemy.x > 4 * R){
					continue;
				}
				
				final int dist = (enemy.x - bullet.x) * (enemy.x - bullet.x) + (enemy.y - bullet.y) * (enemy.y - bullet.y);
				
				if(dist < LIM){
					sum++;
				}
			}
		}
		
		return sum;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(sc.hasNext()){
        	final int A = sc.nextInt();
        	final int B = sc.nextInt();
        	final int R = sc.nextInt();
        	
        	if(A == 0 && B == 0 && R == 0){
        		break;
        	}
        	
        	System.gc();
        	
        	Point[] enemys = new Point[A];
        	Point[] bullets = new Point[B];
        	
        	for(int i = 0; i < A; i++){
        		enemys[i] = new Point(sc.nextShort(), sc.nextShort());
        	}
        	
        	for(int i = 0; i < B; i++){
        		bullets[i] = new Point(sc.nextShort(), sc.nextShort());
        	}
        	
        	System.out.println(check(R, enemys, bullets));
        }
    }
}