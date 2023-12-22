//Volume1-0118
import java.util.ArrayDeque;
import java.util.Scanner;

class El {
	public int x;
	public int y;
	public int r = 0;
	El(int x,int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {

	//declare
	private static ArrayDeque<El> q = new ArrayDeque<El>();
	private static int            h,w,num,x,y;
	private static int    [][]    ck = {{-1,0},{0,-1},{1,0},{0,1}};
	private static char   [][]    orchard;
	private static boolean[][]    map;

	public static void main(String[] args) {

		String[] s;

        //input
        Scanner sc = new Scanner(System.in);
        while(true){
        	s = sc.nextLine().split("\\s");
        	h = Integer.parseInt(s[0]);
        	w = Integer.parseInt(s[1]);
        	if(h+w==0){break;}
        	orchard = new char   [h][w];
        	map     = new boolean[h][w];
        	for(int i=0;i<h;i++){
       			orchard[i] = sc.nextLine().toCharArray();
        	}

        	//calculate
        	num = 0;
        	for(int i=0;i<h;i++){
        		for(int j=0;j<w;j++){
        			if(!map[i][j]){
        				num++;
        				DFS(i,j,orchard[i][j]);
        			}
        		}
        	}

        	//output
        	System.out.println(num);
        }
	}

	public static void DFS(int y_,int x_,char c){

		x=x_;
		y=y_;

		do {
			if(c == orchard[y][x] && !map[y][x]){
				map[y][x] = true;
				q.push(new El(x,y));
			}
		} while (update());
	}

	private static boolean update(){

		El e;
		boolean ret = false;
		while(!q.isEmpty()){
			e = q.peek();
			if(e.r == 4){
				q.pop();
				continue;
			}
			if(e.x + ck[e.r][0] >= 0 && e.x + ck[e.r][0] < w &&
               e.y + ck[e.r][1] >= 0 && e.y + ck[e.r][1] < h ) {
				x = e.x + ck[e.r][0];
				y = e.y + ck[e.r][1];
				e.r++;
				ret = true;
				break;
			} else {
				e.r++;
			}
		}
		return ret;
	}
}