import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main {
	static final int MASS = 21;
	static int PX,PY;
	static int[][] map = new int[MASS][MASS];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int ts = Integer.parseInt(in.readLine());
			if(ts == 0){
				break;
			}
			PX = 10;
			PY = 10;
			for(int i= 0;i < map.length ;i++){
				Arrays.fill(map[i], 0);
			}
			for(int i = 0; i < ts ;i++){
				String[] s = in.readLine().split(" ");
				map[Integer.parseInt(s[0])][Integer.parseInt(s[1])] = 1;
			}
			int mn = Integer.parseInt(in.readLine());
			int gettr = 0;
			for(int i = 0; i < mn ;i++){
				String[] s = in.readLine().split(" ");
				gettr = gettr + move(s[0],Integer.parseInt(s[1]));
			}
			if(ts == gettr){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}	
	}
	static int move(String h ,int n){
		int num = 0;
		if(h.equals("N")){
			for(int i = 1;i <= n;i++){
				if(map[PX][PY+i] == 1){
					num++;
					map[PX][PY+i] = 0;
				}	
			}	
			PY = PY + n;
		}
		else if(h.equals("S")){
			for(int i = 1;i <= n;i++){
				if(map[PX][PY-i] == 1){
					num++;
					map[PX][PY-i] = 0;
				}	
			}	
			PY = PY - n;
		}
		else if(h.equals("E")){
			for(int i = 1;i <= n;i++){
				if(map[PX+i][PY] == 1){
					num++;
					map[PX+i][PY] = 0;
				}	
			}
			PX = PX + n;
		}
		else {
			for(int i = 1;i <= n;i++){
				if(map[PX-i][PY] == 1){
					num++;
					map[PX-i][PY] = 0;
				}		
			}	
			PX = PX - n;
		}
		return num;
	}

}