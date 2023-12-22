/* http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0502 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	private static final int TOP=0, SOUTH=1, EAST=2, WEST=3, NORTH=4, BOTTOM=5;

	//North
	private static void moveNorth(int[] dice){
		int tmpTop = dice[TOP];
		dice[TOP]    = dice[SOUTH];
		dice[SOUTH]  = dice[BOTTOM];
		dice[BOTTOM] = dice[NORTH];
		dice[NORTH]  = tmpTop;
	}

	//South
	private static void moveSouth(int[] dice){
		for(int i=0;i<3;i++){ moveNorth(dice); }
	}
	
	//Right
	private static void moveRight(int[] dice){
		int tmpNorth = dice[NORTH];
		dice[NORTH] = dice[WEST];
		dice[WEST] = dice[SOUTH];
		dice[SOUTH] = dice[EAST];
		dice[EAST] = tmpNorth;
	}

	//Left
	private static void moveLeft(int[] dice){
		for(int i=0;i<3;i++){ moveRight(dice); }
	}

	//East
	private static void moveEast(int[] dice){
		moveLeft(dice);
		moveNorth(dice);
		moveRight(dice);
	}
	
	//West
	private static void moveWest(int[] dice){
		moveRight(dice);
		moveNorth(dice);
		moveLeft(dice);
	}	
	
	public static void main (String[] args){
		try{
			Scanner s = new Scanner(System.in);
			
			while(true){
				int n = s.nextInt();
				if(n==0){ break; }
				
				int[] dice = {1,2,3,4,5,6};

				int ans = 1;
				for(int i=0;i<n;i++){
					String op = s.next();
					
					if(op.equals("North")) moveNorth(dice);
					else if(op.equals("South")) moveSouth(dice);
					else if(op.equals("West")) moveWest(dice);
					else if(op.equals("East")) moveEast(dice);
					else if(op.equals("Right")) moveRight(dice);
					else if(op.equals("Left")) moveLeft(dice);
					
					ans += dice[TOP];
				}
				System.out.println(ans);
			}
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
	}
}