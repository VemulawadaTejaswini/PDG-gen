import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	char[][] map;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.equals(" ")){
				continue;
			}
			map = new char[12][];
			map[0] = str.toCharArray();
			for(int i = 1;i < 12;i++){
				map[i] = scan.nextLine().toCharArray();
			}
			int count = 0;
			for(int i = 0;i < 12;i++){
				for(int j = 0;j < 12;j++){
					if(map[i][j] == '1'){
						count++;
						checkMap(i,j);
					}
				}
			}
			System.out.println(count);
		}
	}
	public void checkMap(int i,int j){
		if(map[i][j] == '0'){
			return;
		}
		map[i][j] = '0';
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		for(int k = 0;k < 4;k++){
			if(i+dy[k] >= 0 && i+dy[k] < 12 && j+dx[k] >= 0 && j+dx[k] < 12){
				checkMap(i+dy[k],j+dx[k]);
			}
		}
		return;
	}
}