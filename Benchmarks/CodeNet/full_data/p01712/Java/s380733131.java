import java.util.*;

public class Main {
	int n, h, w;
	boolean[] hc, wc;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		wc = new boolean[w+1];
		hc = new boolean[h+1];
		
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int ww = sc.nextInt();
			drawWc(x, ww);
			drawHc(y, ww);
		}
		if(checkWc() || checkHc()) System.out.println("Yes");
		else System.out.println("No");
		
		sc.close();
	}
	
	void drawWc(int x, int ww){
		for(int j=x-ww;j<=x+ww;j++){
			if(j>=0 && j<=w){
				wc[j] = true;
			}
		}
	}
	
	void drawHc(int y, int ww){
		for(int i=y-ww;i<=y+ww;i++){
			if(i>=0 && i<=h){
				hc[i] = true;
			}
		}	
	}
	
	boolean checkWc(){
		for(int j=0;j<=w;j++){
			if(!wc[j]) return false;
		}
		return true;
	}
	
	boolean checkHc(){
		for(int i=0;i<=h;i++){
			if(!hc[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}