import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		
		int n, x, y, hoge;
		char flag;
		while(true){
			n = Integer.valueOf(reader.readLine());
			if(n == 0) break;
			
			boolean map[][] = new boolean[21][21];
			for(int i = 0; i < n; i++){
				string = reader.readLine();
				x = Integer.valueOf(string.split(" ")[0]);
				y = 20 - Integer.valueOf(string.split(" ")[1]);
				
				map[y][x] = true;
			}
			
			n = Integer.valueOf(reader.readLine());
			x = y = 10;
			for(int i = 0;  i < n; i++){
				string = reader.readLine();
				flag = string.charAt(0);
				hoge = Integer.valueOf(string.split(" ")[1]);
				
				switch(flag){
				case 'N' : 
					for(int j = 0; j < hoge; j++){
						--y;
						if(map[y][x]) map[y][x] = false;
					}
					break;
				case 'E' : 
					for(int j = 0; j < hoge; j++){
						++x;
						if(map[y][x]) map[y][x] = false;
					}
					break;
				case 'S' : 
					for(int j = 0; j < hoge; j++){
						++y;
						if(map[y][x]) map[y][x] = false;
					}
					break;
				case 'W' :
					for(int j = 0; j < hoge; j++){
						--x;
						if(map[y][x]) map[y][x] = false;
					}
				}
			}
			if(app.judge(map)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		reader.close();
	}
	
	public boolean judge(boolean map[][]){
		boolean res = true;
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				if(map[i][j]){
					res = false;
				}
			}
			if(!res) break;
		}
		return res;
	}
}