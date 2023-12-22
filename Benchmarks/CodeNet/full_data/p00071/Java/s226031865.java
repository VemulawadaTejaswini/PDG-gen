import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	char[][] map;
	int[] dx = {-1,1,0,0};
	int[] dy = {0,0,-1,1};
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int data = Integer.parseInt(scan.nextLine());
			for(int dcase = 0;dcase < data;dcase++){
				scan.nextLine();
				map = new char[8][];
				for(int i = 0;i < 8;i++){
					map[i] = scan.nextLine().toCharArray();
				}
				bomb(Integer.parseInt(scan.nextLine())-1,Integer.parseInt(scan.nextLine())-1,0,-1);
				printOut(dcase+1);
			}
		}
	}
	public void bomb(int x,int y,int depth,int dir){
		if(depth == 4){
			return;
		}
		if(map[y][x] == '1'){
			map[y][x] = '0';
			for(int i = 0;i < 4;i++){
				if(y+dy[i] >= 0 && y+dy[i] < 8 && x+dx[i] >= 0 && x+dx[i] < 8){
					bomb(x+dx[i],y+dy[i],1,i);
				}
			}
		}else if(dir >= 0 && y+dy[dir] >= 0 && y+dy[dir] < 8 && x+dx[dir] >= 0 && x+dx[dir] < 8){
			bomb(x+dx[dir],y+dy[dir],depth+1,dir);
		}
		return;
	}
	public void printOut(int d){
		System.out.println("Data " + d + ":");
		for(int i = 0;i < 8;i++){
			for(int j = 0;j < 8;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}