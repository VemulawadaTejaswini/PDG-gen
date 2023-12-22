
import java.util.*;

public class Main {

	private static int H, W;   
	private static char[][] data;
	
	public static void main(String[] args) {
		
		Scanner fin = new Scanner(System.in);
		
		data = new char[100][100];
		H = fin.nextInt(); 
		W = fin.nextInt();			
		
		while(W != 0 && H != 0){			
			fin.nextLine();
			for(int i=0; i<H; i++ ){
				String line = fin.nextLine();  			
				for(int j=0; j<W; j++){
					data[i][j] = line.charAt(j);								
				}
			}
			int count = 0;
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					if(data[i][j] != ' '){
						DFS(i,j);
						count++;
					}
				}
			}
			System.out.printf("%d\n",count);
			W = fin.nextInt(); 
			H = fin.nextInt();
	    }		
		
		fin.close();
	}
	
	private static int DFS(int x, int y){
		char c = data[x][y];
		data[x][y] = ' ';
		if(x >= 0 && x < H && y > 0 && y < W && data[x][y-1] == c){
			DFS(x, y-1);
		}
		if(x >= 0 && x < H && y >= 0 && y < W-1 && data[x][y+1] == c){
			DFS(x, y+1);
		}
		if(x > 0 && x < H && y >= 0 && y < W && data[x-1][y] == c){
			DFS(x-1, y);
		}
		if(x >= 0 && x < H-1 && y >= 0 && y < W && data[x+1][y] == c){
			DFS(x+1, y);
		}
		
		return 1;		
	}
}