import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Grid[][] grid = new Grid[6][6];
		for(int i = 0; i < 36; i++){
			grid[i/6][i%6] = new Grid();
		}
		
		for(int i = 0; i < 9; i++){
			String tmp = br.readLine();
			
			if(i%2 == 0){
				for(int j = 0; j < 4; j++){
					if(tmp.charAt(j) == '1'){
						grid[i/2 + 1][j + 1].top = true;
						//System.out.println("top");
					}
				}
			}
			else{
				for(int j = 0; j < 5; j++){
					if(tmp.charAt(j) == '1'){
						grid[i/2 + 1][j + 1].left = true;
						//System.out.println("left");
					}
				}
			}
		}
		
		int currentX = 1;
		int currentY = 0;
		final int R = 0;
		final int D = 1;
		final int U = 2;
		final int L = 3;
		
		int mode = R;
		
		StringBuffer sb = new StringBuffer();
		while(true){
			//System.out.println("mode "+ mode +"(x,y)"+currentX + " " + currentY);
			if(mode == R){
				//??´?????????
				if(grid[currentY][currentX + 1].left){
					mode = U;
				}
				//??´??????
				else if(grid[currentY + 1][currentX + 1].top){
					currentX++;
				}
				//??????
				else {
					mode = D;
					currentX++;
					currentY++;
				}
				sb.append("R");
			}
			else if(mode == D){
				//??´?????????
				if(grid[currentY+1][currentX].top){
					mode = R;
				}
				//??´??????
				else if(grid[currentY + 1][currentX].left){
					currentY++;
				}
				//??????
				else {
					mode = L;
					currentX--;
					currentY++;
				}
				sb.append("D");
			}
			else if(mode == U){
				//??´?????????
				if(grid[currentY][currentX].top){
					mode = L;
				}
				//??´??????
				else if(grid[currentY - 1][currentX + 1].left){
					currentY--;
				}
				//??????
				else {
					mode = R;
					currentX++;
					currentY--;
				}
				sb.append("U");
			}
			else {
				//??´?????????
				if(grid[currentY][currentX].left){
					mode = D;
				}
				//??´??????
				else if(grid[currentY][currentX - 1].top){
					currentX--;
				}
				//??????
				else {
					mode = U;
					currentX--;
					currentY--;
				}
				sb.append("L");
			}
			
			if(currentX == 1 && currentY == 1 && mode == L){
				//if(sb.charAt(sb.length() - 1) != 'L'){
				sb.append("L");
				//}
				break;
			}
			else if(currentX == 0 && currentY == 1 && mode == U){
				//if(sb.charAt(sb.length() - 1) != 'U'){
				sb.append("U");
				//}
				break;
			}
		}
		
		System.out.println(sb);
	}

}

class Grid {
	boolean top = false;
	boolean left = false;
}