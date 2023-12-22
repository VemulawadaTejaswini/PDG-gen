import java.util.Scanner;

public class Main {

	boolean[][] map;
	boolean[][] visited;
	int w,h,cnt;
	boolean flag;
	
	void Land(int i, int j){
		if(i<0||j<0||i>=h||j>=w||map[i][j]==false||visited[i][j]==true){
			return;
		}
		visited[i][j] = true;
		flag = true;
		Land(i+1,j);
		Land(i,j+1);
		Land(i-1,j);
		Land(i,j-1);
		Land(i+1,j+1);
		Land(i+1,j-1);
		Land(i-1,j+1);
		Land(i-1,j-1);
	}
	
	void Search(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				flag = false;
				Land(i,j);
				if(flag){
					cnt++;
				}
			}
		}
	}
	
	void run(){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			w = stdIn.nextInt();
			h = stdIn.nextInt();
			if((w|h)==0){
				return;
			}
			map = new boolean[h][w];
			visited = new boolean[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					int tmp = stdIn.nextInt();
					if(tmp==1){
						map[i][j] = true;
					}
				}
			}
			cnt = 0;
			Search();
			System.out.println(cnt);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}