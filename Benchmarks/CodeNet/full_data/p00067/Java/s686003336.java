import java.util.*;

public class Main {
	int[][] map = new int[12][12];
	
	public void func(){
		int count = 0;
		for(int i=0;i<12;i++){
			for(int j=0;j<12;j++){
				if(map[i][j]==1){
					loop(i, j);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public void loop(int y, int x){
		map[y][x]--;
		if(x!=0 && map[y][x-1]==1)loop(y, x-1);
		if(x!=11 && map[y][x+1]==1)loop(y, x+1);
		if(y!=0 && map[y-1][x]==1)loop(y-1, x);
		if(y!=11 && map[y+1][x]==1)loop(y+1, x);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			Main A = new Main();
			String t = "";
			
			for(int i=0;i<12;i++){
				t = sc.next();
				for(int j=0;j<12;j++){
					if(t.codePointAt(j)==49)A.map[i][j]=1;
				}
			}
			A.func();
			
		}
	
	}	
}