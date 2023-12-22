import java.util.*;

public class Main{
    int[][] a;
    boolean[][] f;
    int h, w, res, dy, dx;
    int[] xdir = {0, 1, 1, 1, 0, -1};
    int[] ydir = {-1, -1, 0, 1, 1, 0};
    int[] xdir2 = {-1, 0, 1, 0, -1, -1};
    int[] ydir2 = {-1, -1, 0, 1, 1, 0};

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    w = sc.nextInt();
	    h = sc.nextInt();

	    a = new int[h+2][];
	    f = new boolean[h+2][];
	    for(int i = 0; i < h+2; ++i){
		a[i] = new int[w+2];
		f[i] = new boolean[w+2];
	    }

	    for(int i = 1; i <= h; ++i)
		for(int j = 1; j <= w; ++j)
		    a[i][j] = sc.nextInt();
	    dfs(0, 0);

	    res = 0;
	    for(int i = 0; i < h+2; ++i)
		for(int j = 0; j < w+2; ++j)
		    if(f[i][j])
			for(int k = 0; k < 6; ++k){
			    if(i%2 == 1){ dy = i+ydir[k]; dx = j+xdir[k];}
			    else { dy = i+ydir2[k]; dx = j+xdir2[k];}
			    if(0 <= dy && dy < h+2 && 0 <= dx && dx < w+2)
				res += a[dy][dx];
			}

	    System.out.printf("%d\n", res);
	}
    }

    private void dfs(int y, int x){
	if(!f[y][x] && a[y][x] == 0){
	    f[y][x] = true;
	    for(int i = 0; i < 6; ++i){
		if(y%2 == 1){ dy = y+ydir[i]; dx = x+xdir[i];}
		else { dy = y+ydir2[i]; dx = x+xdir2[i];}

		if(0 <= dy && dy < h+2 && 0 <= dx && dx < w+2) dfs(dy, dx);
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}