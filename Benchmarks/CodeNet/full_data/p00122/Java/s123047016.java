
import java.util.*;
public class Main {
	final int [][] spRange ={
			{-1,-1},{0,-1},{1,-1},
			{-1,0}, {0,0},{1,0},
			{-1,1},{0,1},{1,1}};
	final int [][] pyonRange = {
			{-1,-2},{0,-2},{1,-2},
			{-2,-1},{2,-1},
			{-2,0},{2,0},
			{-2,1},{2,1},
			{-1,2},{0,2},{1,2}};

	int [][] sp;

	private boolean isOutRange(int n){
		if(n < 0 || n >= 10){
			return true;
		}
		else{
			return false;
		}
	}

	private boolean isRangeSP(int x, int y, int index){
		int spx = sp[index][0];
		int spy = sp[index][1];
		for(int i=0; i < spRange.length; i++){
			int pattRangeX = spx + spRange[i][0];
			int pattRangeY = spy + spRange[i][1];
			if(isOutRange(pattRangeX) || isOutRange(pattRangeY))
				continue;
			if(x == pattRangeX && y == pattRangeY ){
				return true;
			}
		}
		return false;
	}

	private boolean isSurvive(int x, int y, int index){
		if(index == sp.length){
			return true;
		}
		if(isOutRange(x) || isOutRange(y)){
			return false;
		}

		if(! isRangeSP(x, y, index)){
			return false;
		}
		else{
			for(int i=0; i < pyonRange.length;i++){
				boolean ans = isSurvive(x + pyonRange[i][0], y + pyonRange[i][1], index + 1 );
				if(ans)
					return true;
			}
			return false;
		}

	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int startx = sc.nextInt();
			int starty = sc.nextInt();
			if(startx == 0 && starty == 0)
				break;
			int n = sc.nextInt();
			sp = new int[n][10];
			for(int i=0; i < n; i++){
				sp[i][0] = sc.nextInt();
				sp[i][1] = sc.nextInt();
			}
			boolean ans = false;
			for(int i=0; i < pyonRange.length; i++){
				ans = isSurvive(startx + pyonRange[i][0], starty + pyonRange[i][1], 0);
				if(ans){
					break;
				}
			}

			if(ans){
				System.out.println("OK");
			}
			else{
				System.out.println("NA");
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}