import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuilder sb = new StringBuilder("R");
		String string;
		int map[][] = new int[13][13], c = 0; 
		for(int i = 0; i < 13; i++) Arrays.fill(map[i], 2);
		while((string = reader.readLine()) != null){
			if(string.equals("")) break;
			char ch[] = string.toCharArray();
			if(ch.length % 2 == 0){
				for(int i = 1; i <= 4; i++){
					map[c + 2][i * 2 + 1] = ch[i - 1] - '0';
				}
			}else{
				for(int i = 0; i < 5; i++){
					map[c + 2][i * 2 + 2] = ch[i] - '0';
				}
			}
			c++;
		}
		int x = 3, y = 2;
		while(true){
			map[y][x] = 0;
			if(map[y][x + 2] == 1){
				x += 2;
				map[y][x] = 0;
				sb.append("R");
			}else if(map[y + 1][x + 1] == 1){
				y++; x++;
				map[y][x] = 0;
				sb.append("D");
			}else if(map[y + 2][x] == 1){
				y += 2;
				map[y][x] = 0;
				sb.append("D");
			}else if(map[y + 1][x - 1] == 1){
				y++; x--;
				map[y][x] = 0;
				sb.append("L");
			}else if(map[y][x - 2] == 1){
				x -= 2;
				map[y][x] = 0;
				sb.append("L");
			}else if(map[y - 1][x - 1] == 1){
				y--; x--;
				map[y][x] = 0;
				sb.append("U");
			}else if(map[y - 2][x] == 1){
				y -= 2;
				map[y][x] = 0;
				sb.append("U");
			}else if(map[y - 1][x + 1] == 1){
				y--; x++;
				map[y][x] = 0;
				sb.append("R");
			}else break;
		}
		System.out.println(sb);
		reader.close();
	}
}