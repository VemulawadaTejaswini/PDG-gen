import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static final int RIGHT = 0, DOWN = 1, LEFT = 2, UP = 3;
	public static Scanner in;
	public static void main(String[] args){
		in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) break;
			int m = in.nextInt();
			Figure base = getFigure(m,getArray(m));
			for(int i=1;i<=n;i++){
				m = in.nextInt();
				int[][] ar = getArray(m);
				Figure obj = getFigure(m,ar);
				if(base.equals(obj)){
					System.out.println(i);
				}else{
					obj = getFigure(m,reverseArray(m,ar));
					if(base.equals(obj)){
						System.out.println(i);
					}
				}
			}
			System.out.println("+++++");
			System.gc();
		}
	}
	
	public static int[][] getArray(int m){
		int[][] array = new int[m][2];
		for(int i=0;i<m;i++){
			array[i][0] = in.nextInt();
			array[i][1] = in.nextInt();
		}
		return array;
	}
	
	public static int[][] reverseArray(int m,int[][] base){
		int[][] array = new int[m][2];
		for(int i=0;i<m;i++){
			array[i][0] = base[m-1-i][0];
			array[i][1] = base[m-1-i][1];
		}
		return array;
	}
	
	public static Figure getFigure(int m,int[][] points){
		Figure fig = new Figure();
		int px = points[0][0];
		int py = points[0][1];
		int x = points[1][0];
		int y = points[1][1];
		int direction;
		if(x==px){
			fig.len.add(Math.abs(y - py));
			if(y-py>0) direction = UP;
			else direction = DOWN;
		}else{
			fig.len.add(Math.abs(x - px));
			if(x-px>0) direction = RIGHT;
			else direction = LEFT;
		}
		for(int i=2;i<m;i++){
			px = x;
			py = y;
			x = points[i][0];
			y = points[i][1];
			if(x==px){
				if(direction==RIGHT){
					fig.turnR.add((y-py>0)?false:true);
				}else{
					fig.turnR.add((y-py>0)?true:false);
				}
			}else{
				if(direction==UP){
					fig.turnR.add((x-px>0)?true:false);
				}else{
					fig.turnR.add((x-px>0)?false:true);
				}
			}
			if(x==px){
				fig.len.add(Math.abs(y - py));
				if(y-py>0) direction = UP;
				else direction = DOWN;
			}else{
				fig.len.add(Math.abs(x - px));
				if(x-px>0) direction = RIGHT;
				else direction = LEFT;
			}
		}
		return fig;
	}
}

class Figure{
	ArrayList<Integer> len;
	ArrayList<Boolean> turnR;
	
	public Figure(){
		len = new ArrayList<Integer>();
		turnR = new ArrayList<Boolean>();
	}
	
	@Override
	public boolean equals(Object o){
		Figure f = (Figure) o;
		return 
			len.equals(f.len) && 
			turnR.equals(f.turnR);
	}
}