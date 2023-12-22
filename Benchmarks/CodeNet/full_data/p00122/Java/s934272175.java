import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public int[][] jump = new int[][]{
		{-1, -2}, {0, -2}, {1, -2},
		{-2, -1}, {2, -1},
		{-2, 0}, {2, 0},
		{-2, 1}, {2, 1},
		{-1, 2}, {0, 2}, {1, 2}
	};

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = in.readLine()) != null){
			List<Point> que = new ArrayList<Point>();
			List<Integer> step = new ArrayList<Integer>();
			String[] tmp = line.split(" ");
			int ix = Integer.parseInt(tmp[0]);
			int iy = Integer.parseInt(tmp[1]);
			if(ix==0 && iy==0) break;
			Point init = new Point(ix, iy);

			line = in.readLine();
			int n = Integer.parseInt(line);
			Point[] sp = new Point[n];
			line = in.readLine();
			tmp = line.split(" ");
			for(int i=0; i<n; i++){
				int xx = Integer.parseInt(tmp[2*i]);
				int yy = Integer.parseInt(tmp[2*i+1]);
				sp[i] = new Point(xx, yy);
			}


			int ok = 0;
			que.add(init);
			step.add(0);
			while(que.size() != 0){
				Point p = que.get(0);
				que.remove(0);
				int s = step.get(0);
				step.remove(0);

				if(s==10){
					ok = 1;
					break;
				}

				for(int i=0; i<12; i++){
					int x = p.x + jump[i][0];
					int y = p.y + jump[i][1];
					if(x>=0 && y>=0 && x<10 && y<10){
						if(x >= sp[s].x-1 && x <=sp[s].x+1 && y >= sp[s].y-1 && y <= sp[s].y+1){
							que.add(new Point(x, y));
							step.add(s+1);
						}
					}
				}
			}

			if(ok==1){
				System.out.println("OK");
			}else{
				System.out.println("NA");
			}
		}
	}
}

class Point{
	int x;
	int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}