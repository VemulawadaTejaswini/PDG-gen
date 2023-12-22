//Volume1-0118
import java.util.Scanner;

public class Main {

	//declare
	private static int         h,w,num;
	private static char   [][] orchard;
	private static boolean[][] map;

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

	public static void DFS(int x,int y,char c){
		if(c != orchard[x][y] || map[x][y]){return;}
		map[x][y] = true;
		if(x-1 >= 0){DFS(x-1,y,c);}
		if(y-1 >= 0){DFS(x,y-1,c);}
		if(x+1 <  w){DFS(x+1,y,c);}
		if(y+1 <  h){DFS(x,y+1,c);}
	}
}