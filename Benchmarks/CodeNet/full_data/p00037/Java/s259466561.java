
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		createGrid();
		Man saburou = new Man(Grid.INITIAL_VECTOR, Grid.X_START_POSITION, Grid.Y_START_POSITION);
		do{
			saburou.go();
		}while(!saburou.goalIn());
	}
	private static void createGrid() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		for(int i = 0; i < Grid.getGridXLength(); i++){
			buf = br.readLine();
			char[] tmpX = buf.toCharArray();
			for(int j = 0; j < tmpX.length; j++){
				Grid.setGridX(i, j, tmpX[j] - '0');
			}
			if(i == Grid.getGridYLength())	break;
			buf=br.readLine();
			char[] tmpY = buf.toCharArray();
			for(int j = 0; j < tmpY.length; j++){
				Grid.setGridY(i, j, tmpY[j] - '0');
			}
		}
	}
}

class Grid{
	public static final int X_START_POSITION = 0;
	public static final int Y_START_POSITION = 0;
	public static final int INITIAL_VECTOR = Man.RIGHT;
	public static final int WALL_EXIST = 1;
	private static int[][] gridX = new int[5][4];
	private static int[][] gridY = new int[4][5];
	public static void setGridX(int i, int j, int exist) {
		Grid.gridX[i][j] = exist;
	}
	public static void setGridY(int i, int j, int exist) {
		Grid.gridY[i][j] = exist;
	}
	public static int getGridXLength() {
		return gridX.length;
	}
	public static int getGridYLength() {
		return gridY.length;
	}
	public static boolean gridXisWall(int i, int j){
		return (gridX[i][j] == WALL_EXIST) ? true : false;
	}
	public static boolean gridYisWall(int i, int j){
		return (gridY[i][j] == WALL_EXIST) ? true : false;
	}
}
class Man{
	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;
	
	private int vector;
	private int x;
	private int y;
	public Man(int initialVector, int startX, int startY) {
		vector = initialVector;
		x = startX;
		y = startY;
	}
	/**
	 * 前回の移動後に決定した方向へ移動する
	 */
	public void go(){
		switch(vector){
		case UP:
			goUp();
			break;
		case DOWN:
			goDown();
			break;
		case LEFT:
			goLeft();
			break;
		case RIGHT:
			goRight();
			break;
		default:
			break;
		}
	}
	/**
	 * 初期位置に戻ってきているか（ゴールしているか）判定する
	 * @return	ゴールしているか
	 */
	public boolean goalIn(){
		return (x == Grid.X_START_POSITION && y == Grid.Y_START_POSITION);
	}
	private void goRight(){
		x++;
		System.out.print("R");
		//上方向に進む
		if(findUpWall()){
			vector = UP;
			return;
		}
		//右方向に進む
		if(findRightWall()){
			vector = RIGHT;
			return;
		}
		//下方向に進む
		if(findDownWall()){
			vector = DOWN;
			return;
		}
	}
	private void goLeft(){
		x--;
		System.out.print("L");
		//下方向に進む
		if(findDownWall()){
			vector = DOWN;
			return;
		}
		//左方向に進む
		if(findLeftWall()){
			vector = LEFT;
			return;
		}
		//上方向に進む
		if(findUpWall()){
			vector = UP;
			return;
		}
	}
	private void goUp(){
		y--;
		System.out.print("U");
		//左方向に進む
		if(findLeftWall()){
			vector = LEFT;
			return;
		}
		//上方向に進む
		if(findUpWall()){
			vector = UP;
			return;
		}
		//右方向に進む
		if(findRightWall()){
			vector = RIGHT;
			return;
		}
	}
	private void goDown(){
		y++;
		System.out.print("D");
		//右方向に進む
		if(findRightWall()){
			vector = RIGHT;
			return;
		}
		//下方向に進む
		if(findDownWall()){
			vector = DOWN;
			return;
		}
		//左方向に進む
		if(findLeftWall()){
			vector = LEFT;
			return;
		}
	}
	private boolean findUpWall(){
		if(y == 0)	return false;
		return	Grid.gridYisWall(y - 1,x);
	}
	private boolean findDownWall(){
		if(y == 4)	return false;
		return Grid.gridYisWall(y, x);
	}
	private boolean findLeftWall(){
		if(x == 0)	return false;
		return Grid.gridXisWall(y, x - 1);
	}
	private boolean findRightWall(){
		if(x == 4)	return false;
		return Grid.gridXisWall(y, x);
	}
}