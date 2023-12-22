import java.util.*;

public class Main{
	public static String solve(char[][] map, boolean[][] record, int[] now){
		while( map[now[0]][now[1]] != '.' ){
			if( record[now[0]][now[1]] == true ){
				return "LOOP";
			}
			record[now[0]][now[1]] = true;
			if( map[now[0]][now[1]] == '>' ){
				++now[1];
			} else if( map[now[0]][now[1]] == '<' ){
				--now[1];
			} else if( map[now[0]][now[1]] == '^' ){
				--now[0];					
			} else if( map[now[0]][now[1]] == 'v' ){
				++now[0];				
			}
								
		}
		return Integer.toString(now[1]) + " " + Integer.toString(now[0]);
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		
		String str;
		while( !(str = stdIn.nextLine()).equals("0 0") ){
			int H, W;
			String[] s = str.split(" ");
			H = Integer.parseInt(s[0]); W = Integer.parseInt(s[1]);
			char[][] map = new char[H][W];
			boolean[][] record = new boolean[H][W];
			int[] now = new int[2];
			for(int i = 0; i < H; i++){
				String data = stdIn.next();
				map[i] = data.toCharArray();
			}
			result.add(solve(map,record,now));
			stdIn.nextLine();				
		}
		
		for(String ans : result){
			System.out.println(ans);
		}
	}
}