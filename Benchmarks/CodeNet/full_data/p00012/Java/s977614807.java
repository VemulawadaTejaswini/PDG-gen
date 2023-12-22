import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int A = 0;
	public static final int B = 1;
	public static final int C = 2;
	public static final int P = 3;
	
	public static final int X = 0;
	public static final int Y = 1;
	
	public static final int SMALL = 0;
	public static final int LARGE = 1;
	public static final int ONLINE = -100;
	public static boolean bUp = false;
	public static boolean bDown = false;
	public static boolean bLeft = false;
	public static boolean bRight = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double[][] pos = new double[4][2];
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 2; j++){
					pos[i][j] = sc.nextDouble();
				}
			}
			int x = 0;
			x += isCross(pos[A],pos[B], pos[P],X);
			x += isCross(pos[B],pos[C], pos[P],X);
			x += isCross(pos[C],pos[A], pos[P],X);
			int y = 0;
			y += isCross(pos[A],pos[B], pos[P],Y);
			y += isCross(pos[B],pos[C], pos[P],Y);
			y += isCross(pos[C],pos[A], pos[P],Y);
			//System.out.println("bUp : bDown : bLeft : bRight" + bUp + bDown + bLeft + bRight );
			if(bUp && bDown && bLeft && bRight){
			//if(x >= 2 && y >= 2){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			bUp = false;
			bDown = false;
			bLeft = false;
			bRight = false;
		}
	}
	
	//pの[point]座標を伸ばしたものが、線分abを1点で交わっていれば1,交わってなければ0、辺上に重なっていればONLINE?
	public static int isCross(double[] a, double[] b, double[] p, int point){
		//abの方程式を求める
		//y = cx + d
		int ret = 0;
		double c = (b[Y] - a[Y]) / (b[X] - a[X]);
		double d = a[Y] - c * a[X];
		//a,bの小さい方が0,大きい方が1
		double[] x = new double[2];
		double[] y = new double[2];
		
		if(a[X] > b[X]){
			x[LARGE] = a[X];
			x[SMALL] = b[X];
		}
		else{
			x[LARGE] = b[X];
			x[SMALL] = a[X];
		}
		if(a[Y] > b[Y]){
			y[LARGE] = a[Y];
			y[SMALL] = b[Y];
		}
		else{
			y[LARGE] = b[Y];
			y[SMALL] = a[Y];
		}
		
		if(point == X){
			//傾きが0のときは場合分け
			if(c == 0){
				//abの範囲にいるか？
				if((x[SMALL] <= p[X] && p[X] <= x[LARGE])){
					if(p[Y] == a[Y]){
						//辺上にいればONLINE
						ret = ONLINE;
					}
					else if(p[Y] > a[Y]){
						ret = 1;
						bDown = true;
					}
					else{
						ret = 1;
						bUp = true;
					}
				}
			}
			//無限大も場合分け
			else if(Math.abs(c) == Double.POSITIVE_INFINITY){
				//abの範囲にいるか？
				if(p[X] == a[X] && (y[SMALL] <= p[Y] && p[Y] <= y[LARGE])){
					//辺上にいればONLINE
					ret = ONLINE;
				}
			}
			else{
				if((x[SMALL] <= p[X] && p[X] <= x[LARGE])){
					double eY = c*p[X] + d;
					if(p[Y] == eY){
						ret = ONLINE;
					}
					else if(p[Y] > eY){
						ret = 1;
						bDown = true;
					}
					else{
						ret = 1;
						bUp = true;
					}
				}		
			}
		}
		//yを調べる
		else{
			//傾きが0のときは場合分け
			if(c == 0){
				//abの範囲にいるか？
				if(p[Y] == a[Y] && (x[SMALL] <= p[X] && p[X] <= x[LARGE])){
					//辺上にいればONLINE
					ret = ONLINE;
				}
			}
			//無限大も場合分け
			else if(Math.abs(c) == Double.POSITIVE_INFINITY){
				//abの範囲にいるか？
				if((y[SMALL] <= p[Y] && p[Y] <= y[LARGE])){
					if(p[X] == a[X]){
						//辺上にいればONLINE
						ret = ONLINE;
					}
					else if(p[X] > a[X]){
						bLeft = true;
						ret = 1;
					}
					else{
						bRight = true;
						ret = 1;
					}
				}
			}
			else{
				if((y[SMALL] <= p[Y] && p[Y] <= y[LARGE])){
					double eX = (p[Y] - d) / c;
					if(p[X] == eX){
						ret = ONLINE;
					}
					else if(p[X] < eX){
						ret = 1;
						bRight = true;
					}
					else{
						ret = 1;
						bLeft = true;
					}
				}		
			}
		}
		return ret;
	}
}