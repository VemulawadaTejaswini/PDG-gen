import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int c = sc.nextInt();
			if(h == 0 && w == 0 && c == 0){
				break;
			}
			else{
				calc(h,w,c);
			}
		}
	}
	int max;
	int x[] = new int[]{0,1,0,-1};
	int y[] = new int[]{1,0,-1,0};
	public void calc(int h, int w, int c){
		max = 0;
		int[][] panel = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				panel[i][j] = sc.nextInt();
			}
		}
		calcPanel(panel, h, w, c, 1);
		System.out.println(max);
	}
	public void calcPanel(int[][] panel, int h, int w, int c, int count){
		if(count == 5){
			int[][] newPanel = change(panel, h, w, c);
			check(newPanel, h, w);
		}
		else{
			for(int i = 1; i < 7; i++){
				int[][] newPanel = change(panel, h, w, i);
				calcPanel(newPanel, h, w, c, count + 1);
			}
		}
	}
	public void check(int[][] panel, int h, int w){
		int[][] checkPanel = new int[h][w];
		checkPanel[0][0] = 1;
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[]{0,0});
		
		int m = 1;
		
		while(list.size() != 0){
			int i = list.get(0)[0];
			int j = list.get(0)[1];
			list.remove(0);
			
			for(int t = 0; t < 4; t++){
				int i1 = i + x[t];
				int j1 = j + y[t];
				if(i1 >= 0 && i1 < h && j1 >= 0 && j1 < w){
					if(checkPanel[i1][j1] == 0 && panel[i1][j1] == panel[0][0]){
						m++;
						list.add(new int[]{i1, j1});
						checkPanel[i1][j1] = 1;
					}
				}
			}
		}
		if(m > max) max = m;
	}
	public int[][] change(int[][] panel, int h, int w, int color){
		int[][] newPanel = new int[h][w];
		int[][] checkPanel = new int[h][w];
		newPanel[0][0] = color;
		checkPanel[0][0] = 1;
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[]{0,0});
		
		while(list.size() != 0){
			int i = list.get(0)[0];
			int j = list.get(0)[1];
			list.remove(0);
			
			for(int t = 0; t < 4; t++){
				int i1 = i + x[t];
				int j1 = j + y[t];
				
				if(i1 >= 0 && i1 < h && j1 >= 0 && j1 < w){
					if(checkPanel[i1][j1] == 0 && panel[i1][j1] == panel[0][0]){
						newPanel[i1][j1] = color;
						list.add(new int[]{i1, j1});
						checkPanel[i1][j1] = 1;
					}
				}
			}
		}
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(newPanel[i][j] == 0){
					newPanel[i][j] = panel[i][j];
				}
			}
		}
		return newPanel;
	}
	public static void main(String[] args){
		new Main().run();
	}
}