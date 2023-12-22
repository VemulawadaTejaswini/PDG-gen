/* Rectangular Seaching */
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

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);

			if(w == 0 && h == 0){
				break;
			}

			String[][] data = new String[h][w];
			Box[] box = new Box[w];
			for(int j=0; j<h; j++){
				line = in.readLine();
				for(int i=0; i<w; i++){
					data[j][i] = line.substring(i, i+1);
				}
			}

			int S = 0;
			int dstS;
			for(int j=0; j<h; j++){
				for(int i=0; i<w; i++){
					if(j==0){
						if(data[j][i].equals("*")){
							box[i] = null;
						}
						else if(i==0){
							box[i] = new Box(1, 1);
						}
						else{
							box[i] = new Box(box[i-1], null, data, i, j);
						}
					}
					else{
						if(data[j][i].equals("*")){
							box[i] = null;
						}
						else if(i==0){
							box[i] = new Box(null, box[i], data, i, j);
						}
						else{
							box[i] = new Box(box[i-1], box[i], data, i, j);
						}
					}

					if(box[i] != null){
						if(S < (dstS = box[i].getMaxS())){
							S = dstS;
						}
					}
				}
			}
			Ans.add(S);
		}

		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}

		in.close();
	}
}

class Box{
	List<Integer> w;
	List<Integer> h;
	int size;

	public Box(){
		this.w = new ArrayList<Integer>();
		this.h = new ArrayList<Integer>();
		size = 0;
	}

	public Box(int w, int h){
		this.w = new ArrayList<Integer>();
		this.h = new ArrayList<Integer>();
		this.w.add(w);
		this.h.add(h);
		size = 1;
	}

	public Box(Box left, Box above, String[][] data, int x, int y){
		int nLeft = 1;
		int nAbove = 1;
		int width = 0;
		int height = 0;

		int i = x-1;
		if(above != null){
			while(true){
				if(i>=0 && i<data[0].length){
					if(data[y][i].equals(".")){
						nLeft++;
						i--;
					}
					else{
						break;
					}
				}
				else{
					break;
				}
			}
		}

		int j = y-1;
		if(left != null){
			while(true){
				if(j>=0 && j<data.length){
					if(data[j][x].equals(".")){
						nAbove++;
						j--;
					}
					else{
						break;
					}
				}
				else{
					break;
				}
			}
		}

		this.w = new ArrayList<Integer>();
		this.h = new ArrayList<Integer>();

		if(left != null){
			for(int n=0; n<left.size; n++){
				if(left.h.get(n) > nAbove){
					height = nAbove;
				}
				else{
					height = left.h.get(n);
				}
				width = left.w.get(n)+1;
				this.add(width, height);
			}
		}

		if(above != null){
			for(int n=0; n<above.size; n++){
				if(above.w.get(n) > nLeft){
					width = nLeft;
				}
				else{
					width = above.w.get(n);
				}
				height = above.h.get(n)+1;
				this.add(width, height);
			}
		}

		if(above == null && left == null){
			this.w.add(1);
			this.h.add(1);
		}

		this.size = this.w.size();
	}

	public int getMaxS(){
		int S = 0;
		int dst;
		for(int i=0; i<this.size; i++){
			dst = this.w.get(i) * this.h.get(i);
			if(S < dst){
				S = dst;
			}
		}

		return S;
	}

	public void add(int w, int h){
		for(int n=0; n<this.size; n++){
			if(w <= this.w.get(n) && h <= this.h.get(n)){
				return;
			}
		}

		this.w.add(w);
		this.h.add(h);
		size++;
	}
}