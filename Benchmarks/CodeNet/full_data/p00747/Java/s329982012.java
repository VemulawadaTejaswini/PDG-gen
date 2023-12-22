import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			else calc(w, h);
		}
	}
	public void calc(int w, int h){
		int[][] kabeMigi = new int[h][w-1];
		int[][] kabeShita = new int[h-1][w];
		for(int i = 0; i < w-1; i++){
			int k = sc.nextInt();
			kabeMigi[0][i] = k;
		}
		for(int t = 0; t < h - 1; t++){
			for(int i = 0; i < w; i++){
				int k = sc.nextInt();
				kabeShita[t][i] = k;;
			}
			for(int i = 0; i < w - 1; i++){
				int k = sc.nextInt();
				kabeMigi[t+1][i] = k;
			}
		}
		int[][] pass = new int[h][w];
		LinkedList<int[]> list = new LinkedList<int[]>();
		list.add(new int[]{0,0});
		pass[0][0] = 1;
		
		boolean ans = false;
		
		while(!list.isEmpty()){
			int[] now = list.pollFirst();
			int nowH = now[0];
			int nowW = now[1];
			if(nowH == h-1 && nowW == w-1){
				System.out.println(pass[nowH][nowW]);
				ans = true;
				break;
			}
			else{
				if(nowW < w-1 && kabeMigi[nowH][nowW] == 0 && pass[nowH][nowW+1] == 0){
					pass[nowH][nowW+1] = pass[nowH][nowW] + 1;
					list.add(new int[]{nowH, nowW+1});
				}
				if(nowH < h-1 && kabeShita[nowH][nowW] == 0 && pass[nowH+1][nowW] == 0){
					pass[nowH+1][nowW] = pass[nowH][nowW] + 1;
					list.add(new int[]{nowH+1, nowW});
				}
				if(nowW > 0 && kabeMigi[nowH][nowW-1] == 0 && pass[nowH][nowW-1] == 0){
					pass[nowH][nowW-1] = pass[nowH][nowW] + 1;
					list.add(new int[]{nowH, nowW-1});
				}
				if(nowH > 0 && kabeShita[nowH-1][nowW] == 0 && pass[nowH-1][nowW] == 0){
					pass[nowH-1][nowW] = pass[nowH][nowW] + 1;
					list.add(new int[]{nowH-1, nowW});
				}
			}
		}
		if(!ans) System.out.println(0); 
		
	}
	

	public static void main(String[] args) {
		new Main().run();
	}
}