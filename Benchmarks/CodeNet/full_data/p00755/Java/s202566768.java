import java.util.*;

public class Main{
    int h,w,c;
    int max;
    int from,to;
    int ans;
    int[][] panel2;
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    public static void main(String[] args){
	new Main().solve();
    }

    void solve(){
	Scanner sc = new Scanner(System.in);
	h = sc.nextInt();
	while(h!=0){
	    ans = 0;
	    w = sc.nextInt();
	    c = sc.nextInt();
	    int[][] panel = new int[h][w];
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    panel[i][j] = sc.nextInt();
		}
	    }
	    
	    max = Integer.MIN_VALUE;
	    identically(0,panel);
	    System.out.println(max);

	    h = sc.nextInt();
	}
    }

    void identically(int count, int[][] panel){
	if(count==4){
	    if(panel[0][0]==c){return;}
	    from = panel[0][0]; to = c;
	    panel2 = panel;
	    change(0,0);

	    ans = 0;
	    from = c; to = 7;
	    change(0,0);
	    max = Math.max(max,ans);
	    return;
	}

	panel2 = new int[h][w];
	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		panel2[i][j] = panel[i][j];
	    }
	}
	for(int i=1; i<=6; i++){
	    if(i==panel[0][0])continue;
	    from = panel[0][0]; to = i;
	    change(0,0);
	    identically(count+1,panel2);
	    for(int k=0; k<h; k++){
		for(int j=0; j<w; j++){
		    panel2[k][j] = panel[k][j];
		}
	    }
	}
    }

    void change(int x, int y){
	panel2[y][x] = to;
	ans++;
	for(int k=0; k<4; k++){
	    int nx = x+dx[k];
	    int ny = y+dy[k];
	    if(ny<h && ny>=0 && nx<w && nx>=0 && panel2[ny][nx]==from){
		change(nx,ny);
	    }
	}
    }
}