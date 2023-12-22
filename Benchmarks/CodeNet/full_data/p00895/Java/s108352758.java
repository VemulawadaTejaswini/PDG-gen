import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h == 0 && w == 0)break;
			else calc(h, w);
			
		}
	}
	public void calc(int w, int h){
		String[][] donut = new String[w][h];
		for(int i = 0; i < w; i++){
			String line = sc.next();
			for(int j = 0; j < h; j++){
				donut[i][j] = line.substring(j, j+1);
			}
		}
		
		
		int x[] = {0, 1, 1, 1, 0,-1,-1,-1};
		int y[] = {1, 1, 0,-1,-1,-1, 0, 1};
		String max = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				for(int k = 0; k < 8; k++){
					String s = donut[i][j];
					int nx = i + x[k];
					int ny = j + y[k];
					if(nx >= w) nx = 0;
					if(nx < 0) nx = w-1;
					if(ny >= h) ny = 0;
					if(ny < 0) ny = h-1;
					while(!(nx == i && ny == j)){
						s += donut[nx][ny];
						if(map.containsKey(s)){
							if(max.length() < s.length()) max = s;
							else if(max.length() == s.length() && s.compareTo(max) < 0) max = s;
						}
						else if(max.length() < s.length()) map.put(s, 1);
						else if(max.length() == s.length() && s.compareTo(max) < 0) map.put(s, 1);
						
						nx += x[k];
						ny += y[k];
						if(nx >= w) nx = 0;
						if(nx < 0) nx = w-1;
						if(ny >= h) ny = 0;
						if(ny < 0) ny = h-1;
					}	
				}
			}
			System.gc();
		}
		if(max.equals("")) System.out.println(0);
		else System.out.println(max);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}