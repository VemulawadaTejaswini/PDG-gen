import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int h;
		int w;
		int n;
		int[][] route;
		while(true){
			h = scan.nextInt();
			w = scan.nextInt();
			n = scan.nextInt();
			if(h == 0 && w == 0 && n == 0){
				break;
			}
			route = new int[h][w];
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					route[i][j] = scan.nextInt();
				}
			}
			for(int i = 0;i < n;i++){
				x = 0;
				y = 0;
				while(x < h && y < w){
					if(route[x][y] == 0){
						route[x][y] = 1;
						x++;
					}else{
						route[x][y] = 0;
						y++;
					}
				}
			}
			System.out.println(x+1 + " " + (y+1));
		}
	}
}