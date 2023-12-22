import java.util.*;

public class Main {
	int n, h, w;
	boolean[] hc, wc;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		wc = new boolean[w];
		hc = new boolean[h];
		
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int ww = sc.nextInt();
			
			int stx = Math.max(0, x-ww);
			int edx = Math.min(w-1, x-1+ww);
			for(int j=stx;j<=edx;j++) wc[j] = true;
			
			int sty = Math.max(0, y-ww);
			int edy = Math.min(h-1, y-1+ww);
			for(int j=sty;j<=edy;j++) hc[j] = true;
		}
		if(checkWc() || checkHc()) System.out.println("Yes");
		else System.out.println("No");
		
		sc.close();
	}
	
	boolean checkWc(){
		for(int j=0;j<w;j++){
			if(!wc[j]) return false;
		}
		return true;
	}
	
	boolean checkHc(){
		for(int i=0;i<h;i++){
			if(!hc[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}