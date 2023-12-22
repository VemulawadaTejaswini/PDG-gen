import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int[] v1 = {2,0,-2,0};
	static int[] v2 = {0,2,0,-2};
	static int[] v3 = {1,0,-1,0};
	static int[] v4 = {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			String[] s = str.split(" " );
			int w = Integer.parseInt(s[0]);
			int h = Integer.parseInt(s[1]);
			if(w+h==0){
				break;
			}
			s = new String[h*2-1];
			for(int i = 0; i < h*2-1;i++){
				s[i]=br.readLine();
				if(s[i].length()!=w*2-1){
					s[i]=s[i]+" ";
				}
			}
			char[][] field=new char[h*2-1][];
			for(int i = 0; i < h*2-1;i++){
				field[i]=s[i].toCharArray();
			}


			int[][] saitan=new int[h][w];
			for(int i = 0; i < h;i++){
				for(int j = 0; j < w;j++){
					saitan[i][j]=10000;
				}
			}
			saitan[0][0]=1;
			int tmph=h-1;
			int tmpw=w-1;
			h=h*2-1;
			w=w*2-1;
			Queue<Integer[]> q = new LinkedList<Integer[]>();
			Integer[] pair = {0,0};
			q.add(pair);
			while(!q.isEmpty()){
				Integer[] p = q.poll();
				int x = p[0];
				int y  =p[1];
				//System.out.println(x+"  "+y+" " + saitan[x/2][y/2]);
				for(int i = 0; i < 4;i++){
					int xx = x+v1[i];
					int yy = y+v2[i];
					int xxx = x+v3[i];
					int yyy = y+v4[i];
					if(xx>=0&&xx<h&&yy>=0&&yy<w){
						if(field[xxx][yyy]=='0'){
							if(saitan[(xx)/2][(yy)/2]>saitan[x/2][y/2]+1){
								saitan[(xx)/2][(yy)/2]=saitan[x/2][y/2]+1;
								Integer[] next = {xx,yy};
								q.add(next);
							}
						}
					}
				}
			}
			if(saitan[tmph][tmpw]==10000){
				System.out.println(0);
			}
			else{
				System.out.println(saitan[tmph][tmpw]);
			}
		}
	}

}