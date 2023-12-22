import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			br.readLine();
			
			String[] tmpArray = new String[8];
			for(int j = 0; j < 8; j++){
				tmpArray[j] = br.readLine();
			}
			
			Board board = new Board();
			board.generateBoard(tmpArray);
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			board.burn(x, y);
			board.print(i+1);
		}
		
		
		
	}

}

class Board {
	Tile[][] tiles = new Tile[8][8];
	
	public void generateBoard(String[] input){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				Tile tmp;
				//System.out.println("i = "+i+" j = "+j);
				if(input[i].charAt(j) == '0'){
					tmp = new Tile(j, i, Tile.NONE);
				}
				else{
					tmp = new Tile(j, i, Tile.BOMB);
				}
				tiles[i][j] = tmp;
			}
		}
	}
	
	public void burn(int x, int y){
		ArrayDeque<Tile> queue = new ArrayDeque<Tile>();
		queue.push(tiles[y-1][x-1]);
		
		while(!queue.isEmpty()){
			Tile tmpTile = queue.poll();
			
//			System.out.println("Bomb "+tmpTile.x+" "+tmpTile.y+" fired");
			tmpTile.state = Tile.NONE;
			for(int i = Math.max(tmpTile.y-3, 0) ; i <= Math.min(tmpTile.y+3, 7) ; i++){
				if(tiles[i][tmpTile.x].state == Tile.BOMB){
					queue.push(tiles[i][tmpTile.x]);
				}
			}
			for(int i = Math.max(tmpTile.x-3, 0) ; i <= Math.min(tmpTile.x+3, 7) ; i++){
				if(tiles[tmpTile.y][i].state == Tile.BOMB){
					queue.push(tiles[tmpTile.y][i]);
				}
			}
		}
	}
	
	public void print(int num){
		System.out.println("Data "+num+":");
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(tiles[i][j].state == Tile.BOMB){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}

class Tile{
	static final int NONE = 0;
	static final int BOMB = 1;
//	static final int BURNED = 2;
	int state;
	int x;
	int y;
	
	public Tile(int x, int y, int state){
		this.state = state;
		this.x = x;
		this.y = y;
	}
}