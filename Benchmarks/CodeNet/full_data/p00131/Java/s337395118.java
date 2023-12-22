import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public int[][] offset = new int[][]{
			{-1, 0}, {1, 0}, {0, -1}, {0, 1}
	};
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int size = Integer.parseInt(line);
		
		for(int n=0; n<size; n++){
			int[][] data = new int[10][10];
			for(int y=0; y<10; y++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				for(int x=0; x<10; x++){
					data[y][x] = Integer.parseInt(tmp[x]);
				}
			}
			
			int[][] button = solve(data);
			
			for(int y=0; y<10; y++){
				for(int x=0; x<10; x++){
					System.out.print(button[y][x]);
					if(x!=9) System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	
	public int[][] solve(int[][] prob){
		int is_break = 0;
		int[][] button = null;
		for(int i=0; i<1024; i++){
			int[][] data = deepClone(prob);
			button = new int[10][10];
			int[] bin = num_to_bin(i);
			for(int x=0; x<10; x++){
				if(bin[x]==1){
					button[0][x]=1;
					data[0][x]^=1;
					for(int d=0; d<3; d++){
						int xx = x+offset[d][0];
						int yy = offset[d][1];
						if(xx>=0 && yy>=0 && xx<10 && yy<10){
							data[yy][xx]^=1;
						}
					}
				}
			}
			
			for(int y=1; y<10; y++){
				for(int x=0; x<10; x++){
					if(data[y-1][x]==1){
						button[y][x]^=1;
						data[y][x]^=1;
						for(int d=0; d<4; d++){
							int xx = x+offset[d][0];
							int yy = y+offset[d][1];
							if(xx>=0 && yy>=0 && xx<10 && yy<10){
								data[yy][xx]^=1;
							}
						}
					}
				}
			}
			
			is_break = 1;
			for(int x=0; x<10; x++){
				if(data[9][x]==1){
					is_break = 0;
					break;
				}
			}
			
			if(is_break==1){
				break;
			}
		}
		return button;
	}
	
	public int[][] deepClone(int[][] data){
		int[][] copy = new int[10][10];
		for(int y=0; y<10; y++){
			for(int x=0; x<10; x++){
				copy[y][x] = data[y][x];
			}
		}
		return copy;
	}
	
	public int[] num_to_bin(int n){
		int[] bin = new int[10];
		for(int i=0; i<10; i++){
			if(n%2 == 0){
				bin[i] = 0;
			}else{
				bin[i] = 1;
			}
			n = n/2;
		}
		
		return bin;
	}
}