import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h, w;
		h = sc.nextInt();
		w = sc.nextInt();
		
		String[] t = new String[h];
		for(int i = 0; i < h; i++){
			t[i] = sc.next();
		}
		
		String[][] x = new String[h][w];
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				x[i][j] = t[i].substring(j, j+1);
			}
		}
		
		int black = 0;
		int white = 0;
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(x[i][j] == "."){
					white++;
				}else{
					black++;
				}
			}
		}
		
		int[][] count = new int[h][w];
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				count[h][w] = -1;
			}
		}
		count[0][0] = 0;
		
		int ans = 0;
		
		for(int k = 1; count[h-1][w-1] == -1 && k < h * w; k++){
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(count[i][j] == k-1){
						if(i-1 >= 0){
							if(count[i-1][j] == -1 && x[i-1][j] == "."){
								count[i-1][j] = k;
							}
						}
						if(i+1 < h){
							if(count[i+1][j] == -1 && x[i+1][j] == "."){
								count[i+1][j] = k;
							}
						}
						if(j-1 >= 0){
							if(count[i][j-1] == -1 && x[i][j-1] == "."){
								count[i][j-1] = k;
							}
						}
						if(j+1 < w){
							if(count[i][j+1] == -1 && x[i][j+1] == "."){
								count[i][j+1] = k;
							}
						}
					}
				}
			}
		}
		if(count[h-1][w-1] == -1){
			ans = -1;
		}else{
			ans = h * w - count[h-1][w-1] -1 - black;
		}
		System.out.println(ans);
	}
}
