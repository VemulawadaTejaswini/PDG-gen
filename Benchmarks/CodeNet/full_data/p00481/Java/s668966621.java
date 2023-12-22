import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	static int w;
	static int h;
	static int dx[]={-1,0,1,0};
	static int dy[]={0,-1,0,1};
	static char map[][];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		int n = sc.nextInt();
		
		int ch[][] = new int[n+1][2];
		
		map =new char[h][];
		for(int i = 0;i<h;i++){
			map[i] = sc.next().toCharArray();
			for(int j=0;j<w;j++){
				if(map[i][j]=='S'){
					ch[0][0]=j;
					ch[0][1]=i;
				}
				if('1'<=map[i][j] && map[i][j]<='9'){
					ch[map[i][j]-'0'][0] = j;
					ch[map[i][j]-'0'][1] = i;
				}
			}
		}
		int total = 0;
		for(int i=0;i<n;i++){
			total+=search(ch[i][0],ch[i][1],ch[i+1][0],ch[i+1][1]);
		}
		System.out.println(total);
	}
	
	static int search(int x,int y,int tox,int toy){
		boolean visited[][] = new boolean[h][w];
		Deque<int[]> q = new ArrayDeque<>();
		q.offer(new int[]{x,y,0});
		while(!q.isEmpty()){
			int now[]=q.poll();
			if(now[0]==tox && now[1]==toy)return now[2];
			for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if ((0 <= ny && ny < h) && (0 <= nx && nx < w) && !visited[ny][nx] && map[ny][nx] != 'X') {
                    visited[ny][nx] = true;
                    q.offer(new int[] { nx, ny, now[2] + 1 });
                }
			}
		}
		return 0;
	}
}