import java.util.*;
import java.awt.geom.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int r = sc.nextInt();
			if((h|r) == 0) break;
			Point2D [] house = new Point2D[h];
			for(int i = 0; i < h; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				house[i] = new Point2D.Double(x, y);
			}
			int [] size = new int[3];
			int [] deg = new int[3];
			for(int i = 0; i < 3; i++){
				size[i] = sc.nextInt();
			}
			for(int i = 0; i < 3; i++){
				deg[i] = sc.nextInt();
			}
			ArrayList<ArrayList<Point2D>> ps = new ArrayList<ArrayList<Point2D>>();
			for(int i =0; i < 3; i++){
				ps.add(new ArrayList<Point2D>());
				for(int j = 0; j < size[i]; j++){
					ps.get(i).add(new Point2D.Double(sc.nextInt(), sc.nextInt()));
				}
			}
			int [][] wind = new int[r][2];
			for(int i = 0; i < r; i++){
				wind[i][0] = sc.nextInt();
				wind[i][1] = sc.nextInt();
			}
			
			int [] count = new int[h];
			Point2D myhome = new Point2D.Double(0,0);
			//日付ごと
			for(int i = 0; i < r; i++){
				//ある家ごとにみる
				//自分以外の香りが届いているか？
				//すべて届いていないならば、自分の香りが届いているか？trueならばcount++;
				
				for(int j = 0; j < h; j++){
					boolean res = isBadFlourReach(wind[i],deg,ps, house[j]);
					if(! res){
						res = isFlourReach(wind[i],deg[0],myhome, house[j]);
						if(res){
							count[j]++;
						}
					}
				}
			}
			int max = 1;
			for(int i = 0; i < count.length; i++){
				max = Math.max(max, count[i]);
			}
			StringBuilder anshouse = new StringBuilder();
			for(int i = 0; i < count.length; i++){
				if(max == count[i]){
					anshouse.append(" " + (i + 1));
				}
			}
			if(anshouse.length() == 0){
				System.out.println("NA");
			}
			else{
				System.out.println(anshouse.substring(1));
			}
		}
	}
	

	private boolean isFlourReach(int[] wind, int deg, Point2D myhome, Point2D target) {
		double dis = myhome.distance(target);
		if(myhome.distance(target) > wind[1]){
			return false;
		}
		double x = (target.getX() - myhome.getX()) / dis;
		double y = (target.getY() - myhome.getY()) / dis;
		double res = Math.atan2(y, x);
		double resdeg = Math.toDegrees(res);
		double windmax = wind[0] + (double)deg / 2;
		double windmin = wind[0] - (double)deg / 2;
		if(windmin <= resdeg && resdeg <= windmax){
			return true;
		}
		resdeg += 360;
		if(windmin <= resdeg && resdeg <= windmax){
			return true;
		}
		return false;
	}


	private boolean isBadFlourReach(int[] wind, int[] deg, ArrayList<ArrayList<Point2D>> ps, Point2D target) {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < ps.get(i).size(); j++){
				if(isFlourReach(wind, deg[i], ps.get(i).get(j), target)){
					return true;
				}
			}
		}
		return false;
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}