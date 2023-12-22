import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	static int W;
	static int H;
	static int[][] MAP ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			// 整数の入力
			W = Integer.parseInt(sc.next());
			H = Integer.parseInt(sc.next());
			if(W==0 && H==0)break;
			MAP = new int[H][W];
			
			for(int h=0; h<H; h++){
				for(int w=0; w<W; w++){
					MAP[h][w] = Integer.parseInt(sc.next());
				}
			}
			int ans=0;
			
			for(int h=0; h<H; h++){
				for(int w=0; w<W; w++){
					if(MAP[h][w]==1){
						dfs(w,h);
						ans++;
					}
				}
			}
			
			
			System.out.println(ans);
		}
		sc.close();
	}
	
	public static void dfs(int w, int h){
		if(w<0 || w>=W || h<0 || h>=H)return;
		if(MAP[h][w] == 0)return;
		MAP[h][w] = 0;
		for(int dh=-1; dh<2; dh++){
			for(int dw=-1; dw<2; dw++){
				dfs(w+dw, h+dh);
			}
		}
	}
	
}

