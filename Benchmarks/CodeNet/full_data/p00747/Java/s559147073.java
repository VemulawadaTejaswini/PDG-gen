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
		pass[0][0] = 1;
		int ans = iter(0, 0, w, h, kabeMigi, kabeShita, pass);
		
		if(ans > w * h) System.out.println(0);
		else System.out.println(ans);
	}
	public int iter(int nowW, int nowH, int w, int h, int[][] kabeMigi, int[][] kabeShita, int[][] pass){
		if(nowW == w - 1 && nowH == h - 1) return 1;
		else{
			int t1 = w * h + 1;
			if(nowW < w-1 && kabeMigi[nowH][nowW] == 0 && pass[nowH][nowW + 1] == 0){
				pass[nowH][nowW + 1] = 1;
				t1 = iter(nowW + 1, nowH, w, h, kabeMigi, kabeShita, pass) + 1;
			}
			int t2 = w * h + 1;
			if(nowH < h-1 && kabeShita[nowH][nowW] == 0 && pass[nowH + 1][nowW] == 0){
				pass[nowH + 1][nowW] = 1;
				t2 = iter(nowW, nowH + 1, w,h,kabeMigi, kabeShita, pass) + 1;
			}
			int t3 = w * h + 1;
			if(nowW > 0 && kabeMigi[nowH][nowW - 1] == 0 && pass[nowH][nowW - 1] == 0){
				pass[nowH][nowW - 1] = 1;
				t3 = iter(nowW-1, nowH, w,h,kabeMigi, kabeShita, pass) + 1;
			}
			int t4 = w * h + 1;
			if(nowH > 0 && kabeShita[nowH-1][nowW] == 0 && pass[nowH-1][nowW] == 0){
				pass[nowH-1][nowW] = 1;
				t4 = iter(nowW, nowH-1, w,h,kabeMigi, kabeShita, pass) + 1;
			}
			return Math.min(t1,  Math.min(t2, Math.min(t3, t4)));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}