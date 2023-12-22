//Volume2-0215
import java.util.ArrayList;
import java.util.Scanner;

class Cell{
	public int x,y,w;
	Cell(int x,int y){
		this.x=x; this.y=y;
	}
}

class Main {

	private static final int                        NOT_FOUND = -1,
			                                        ALL_EXIST =  9,
			                                        FALSE     = -1;
	private static       int                        x,y;
	private static       char[][]                   board;
	private static       ArrayList<ArrayList<Cell>> list  = new ArrayList<ArrayList<Cell>>();
	private static       Cell                       start,goal;

	public static void main(String[] args){

		String result;
		int[]  ret;

		Scanner sc = new Scanner(System.in);

		String[] s;
		while(true){
			s = sc.nextLine().split("\\s");
			x = Integer.parseInt(s[0]);
			y = Integer.parseInt(s[1]);
			if(x==0&&y==0){break;}
			board = new char[y][x];
			for(int i=0;i<y;i++){
				board[i] = sc.nextLine().toCharArray();
			}
			init();
			ret = calc_01();
			if   (ret[0]==NOT_FOUND){result = "NA";}
			else                    {result = (ret[0]+1) + " " + ret[1];}
			System.out.println(result);
		}
	}

	private static void init(){
		list.clear();
		for(int i=0;i<5;i++){list.add(new ArrayList<Cell>());}
		char ch;
		for(int i=0;i<y;i++){
			for(int j=0;j<x;j++){
				ch   = board[i][j];
				switch(ch){
					case '1':
					case '2':
					case '3':
					case '4':
					case '5': {list.get(Character.digit(ch, 10)-1).add(new Cell(i,j));
							   break;                                                 }
					case 'S': {start = new Cell(i,j);   break;}
					case 'G': {goal  = new Cell(i,j);         }
				}
			}
		}
	}

	private static int[] calc_01(){
		int   move;
		int[] min = new int[2];
		min[0] = -1; min[1] = Integer.MAX_VALUE;

		int isExist = check_exist();

		switch (isExist){
			case ALL_EXIST : {
				for(int i=0;i<5;i++){
					if((move = calc_02(i)) < min[1]){
						min[0] = i;
						min[1] = move;
					}
				}
				break;
			}
			case 0 :
			case 1 :
			case 2 :
			case 3 :
			case 4 : {
				min[0] = isExist;
				min[1] = calc_02(isExist);
				break;
			}
			default: {
				min[0] = NOT_FOUND;
			}
		}
		return min;
	}

	private static int check_exist(){
		int lost = -9,
		    cnt  =  0;

		for(int i=0;i<5;i++){
			if(list.get(i).size()==0){
				lost = i;
				cnt++;
			}
		}
		switch (cnt){
			case 0  : {return ALL_EXIST;}
			case 1  : {return lost     ;}
			default : {return FALSE    ;}
		}
	}

	private static int calc_02(int i){
		ArrayList<Cell>  wrap = new ArrayList<Cell>();
		wrap.add(start);
		calc_03(wrap,list.get((++i)%5));
		for(int j=0;j<3;j++){
			calc_03(list.get(i%5),list.get((++i)%5));
		}
		wrap.clear();
		wrap.add(goal);
		calc_03(list.get(i%5),wrap);
		return goal.w;
	}

	private static void calc_03(ArrayList<Cell> a,ArrayList<Cell> b){
		int  min = Integer.MAX_VALUE,
			 d;
		Cell ca  = null,
		     cb  = null;
		for(int i=0;i<b.size();i++){
			cb = b.get(i);
			for(int j=0;j<a.size();j++){
				ca = a.get(j);
				d = distance(ca,cb)+ca.w;
				if(min > d){
					min = d;
				}
			}
			cb.w = min;
		}
	}

	private static int distance(Cell a,Cell b){
		return Math.abs(a.x-b.x)+Math.abs(a.y-b.y);
	}
}