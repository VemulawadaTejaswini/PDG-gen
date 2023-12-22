//Volume1-0141
import java.util.Scanner;

public class Main {

	private static int x,y,dr,n;
	private static final int     X   = 0,
			                     Y   = 1;
	private static final int[][] dir = {{0,-1},{1,0},{0,1},{-1,0}};
	private static char[][] ptn;

	public static void main(String[] args){

		//declare
		int d;

		//input
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        while(d-- > 0){
        	n   = sc.nextInt();
        	ptn = new char[n][n];
        	init();
        	while(true){
        		if(search()){
        			Go();
        		} else {
        			break;
        		}
        	}
        	print();
        }
	}

	private static void print(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(ptn[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void Go(){
		x += dir[dr][X];
		y += dir[dr][Y];
		ptn[y][x] = '#';
	}

	private static void init(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				ptn[i][j] = ' ';
			}
		}
    	x   = 0;
    	y   = n;
    	dr  = 0;
	}

	private static boolean search(){
		boolean ret = false;
		for(int i=0;i<2;i++){
			if(chk(x,y,dr)){ret = true;break;}
			turn();
		}
		return ret;
	}

	private static boolean chk(int x,int y,int r){
		boolean ret = false;
		int r_x,r_y;
		int s_x = x+dir[r][X];
		int s_y = y+dir[r][Y];
		if(s_x < 0 || s_x >= n || s_y < 0 || s_y >= n || ptn[s_y][s_x] == '#'){
			return ret;
		}
		r=trn(r,-1);
		ret = true;
		for(int i=0;i<3;i++){
			r_x = s_x+dir[r][X];
			r_y = s_y+dir[r][Y];
			if(0 <= r_x && r_x < n && 0 <= r_y && r_y < n && ptn[r_y][r_x] == '#'){
				ret = false;
				break;
			}
			r = trn(r);
		}
		return ret;
	}

	private static int trn(int r){
		return ++r%4;
	}
	private static int trn(int r,int i){
		return (r+i+4)%4;
	}

	private static void turn(){
		dr = ++dr%4;
	}
}