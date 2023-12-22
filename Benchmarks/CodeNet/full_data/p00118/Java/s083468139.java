import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}
	
	int[][] offset = new int[][]{
			{-1, 0}, {1, 0}, {0, -1}, {0, 1}
	};


	public Main() throws IOException, StackOverflowError{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);

			if(h==0 && w==0){
				break;
			}

			int[][] data = new int[h+2][w+2];
			int[][] label = new int[h+2][w+2];
			for(int j=1; j<=h; j++){
				line = in.readLine();
				for(int i=1; i<=w; i++){
					String c = line.substring(i-1, i);
					if(c.equals("@")){
						data[j][i] = 1;
					}
					else if(c.equals("#")){
						data[j][i] = 2;
					}
					else if(c.equals("*")){
						data[j][i] = 3;
					}
					label[j][i] = 0;
				}
			}
			
			for(int j=0; j<h+2; j++){
				data[j][0] = 0;
				data[j][h+1] = 0;
				label[j][0] = -1;
				label[j][h+1] = -1;
			}
			
			for(int i=0; i<w+2; i++){
				data[0][i] = 0;
				data[w+1][i] = 0;
				label[0][i] = -1;
				label[w+1][i] = -1;
			}
			

			int count = 0;
			for(int j=1; j<=h; j++){
				for(int i=1; i<=w; i++){
					if(label[j][i] == 0){
						count++;
						label[j][i] = count;
						grouping(data, label, i, j);
					}
				}
			}

			Ans.add(count);
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}

	public void grouping(int[][] data, int[][] label, int x, int y){
		List<point> cue = new ArrayList<point>();
		cue.add(new point(x, y));
		while(cue.size() != 0){
			point p = cue.get(0);
			cue.remove(0);
			for(int d=0; d<4; d++){
				int xx = p.x + offset[d][0];
				int yy = p.y + offset[d][1];
				if(label[yy][xx] == 0 && data[yy][xx] == data[p.y][p.x]){
					label[yy][xx] = label[p.y][p.x];
					if(cue.size() < 10){
						cue.add(new point(xx, yy));
					}
				}
			}
		}
	}
}

class point{
	int x;
	int y;
	
	public point(int x, int y){
		this.x = x;
		this.y = y;
	}
}