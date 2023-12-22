import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	char[][] map;
	int count = 0;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int w = scan.nextInt();
			int h = scan.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			map = new char[h][w];
			for(int i = 0;i < h;i++){
				map[i] = scan.next().toCharArray();
			}
			count = 0;
			boolean fl = false;
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					if(map[i][j] == '@'){
						count++;
						map[i][j] = '#';
						if(i != 0){
							searchTile(i-1,j);
						}
						if(i != h-1){
							searchTile(i+1,j);
						}
						if(j != 0){
							searchTile(i,j-1);
						}
						if(j != w-1){
							searchTile(i,j+1);
						}
						fl = true;
						break;
					}
				}
				if(fl){
					break;
				}
			}
			System.out.println(count);
		}
	}
	public void searchTile(int y,int x){
		if(map[y][x] == '#'){
			return;
		}
		count++;
		map[y][x] = '#';
		if(y != 0){
			searchTile(y-1,x);
		}
		if(y != map.length-1){
			searchTile(y+1,x);
		}
		if(x != 0){
			searchTile(y,x-1);
		}
		if(x != map[0].length-1){
			searchTile(y,x+1);
		}
	}
}