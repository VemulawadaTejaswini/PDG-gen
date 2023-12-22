
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i, cnt = 0;
		int N = sc.nextInt();
		String name = sc.next();
		String[] kanban = new String[N];
		for(i=0; i<N; i++)kanban[i] = sc.next();
		
		for(i=0; i<N; i++){
			String board = kanban[i]; 
			cnt += Check(name, board);
		}
		System.out.println(cnt);
	}
	
	
	public static int Check(String name, String board){
		int i, j, k, x, y = 0, yy = 0, space;
		char[] nameC = name.toCharArray();
		
A:		for(i=0; i<board.length(); i++){
			x = board.indexOf(nameC[0], i);
			if(x<0)return 0;
			for(j=0; j+i<board.length(); j++){
				if(y == 0){
					y = board.indexOf(nameC[1], x);
					yy = y;
				}
				else y = board.indexOf(nameC[1], yy);
				yy += y;
				if(y<0)return 0;
				space = y - x;
				for(k=0; k+2<name.length(); k++){
					if(board.indexOf(nameC[k+2]) < 0)continue A;
					if(board.indexOf(nameC[k+2]) -board.indexOf(nameC[k+1]) !=space)continue A;
					if(k+2 == name.length() -1)return 1;
				}
			}
		}
		return 0;
	}
}