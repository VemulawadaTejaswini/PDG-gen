import java.util.*;

public class Main {
	int h, w;
	int[][] map;
	
	public void loop(int y, int x, int d){
		map[y][x] = 0;
		if(x!=0 && map[y][x-1]==d) loop(y,x-1,d);
		if(y!=0 && map[y-1][x]==d) loop(y-1,x,d);
		if(x!=w-1 && map[y][x+1]==d) loop(y,x+1,d);
		if(y!=h-1 && map[y+1][x]==d) loop(y+1,x,d);
	}
	
	public void func(){
		int count = 0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]!=0){
					count++;
					loop(i, j, map[i][j]);
				}
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main A = new Main();
		
		while(true){
			A.h = sc.nextInt();
			A.w = sc.nextInt();
			if(A.h==0 && A.w==0) break;
			
			A.map = new int[A.h][A.w];
			String s = "";
			for(int i=0;i<A.h;i++){
				s = sc.next();
				for(int j=0;j<A.w;j++){
					if(s.codePointAt(j)==64) A.map[i][j] = 1;
					else if(s.codePointAt(j)==35) A.map[i][j] = 2;
					else if(s.codePointAt(j)==42) A.map[i][j] = 3;
				}
			}
			A.func();
		}
		
	}	
}