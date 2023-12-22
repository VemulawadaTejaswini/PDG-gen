/*
icpc??´?????????
2010??´ ?????? C??????
*/
import java.io.*;

class HOME_C {
	static int map[];
	static int mapb[];
	
	public static void main(String[] args) {
		try {
			run();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
	private static void run() throws IOException{
		final int MAX = 1000000;
		int n;
		int instant;
		map = new int[MAX+1];
		mapb = new int[MAX+1];
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1;i<=MAX;i++) {
			//if(i%100000==0)System.out.print(".");
			map[i] = f(i);
			//mapb[i] = fb(i);
		}
		//System.out.println("");
		
		while(true) {
			n = Integer.parseInt(in.readLine()); //???????????£?????????
			if(n==0) break;
			
			//System.out.println(map[n] + " " + mapb[n]);
		}
		System.exit(0);
	}
	
	private static int f(int n) {
		int instant;
		int min=1000000;
		int tk;
		
		if(n<=0) return 0;
		
		for(int i=n;i>0;i--) {
			if(i>1000) {
				i = 1000;
				continue;
			}
			
			tk = i*(i+1)*(i+2)/6;
			
			if(n-tk < 0) continue;
			
			if(map[n-tk] > 0) {
				if(min > map[n-tk]) {
					min = map[n-tk];
				}
			}
			else if(min > (instant=f(n-tk))) {
				min = instant;
			}
		}
		
		return 1+min;
	}
	
	private static int fb(int n) {
		int instant;
		int min=1000000;
		int tk;
		
		if(n<=0) return 0;
		
		for(int i=n;i>0;i--) {
			if(i>1000) {
				i = 1000;
				continue;
			}
			
			tk = i*(i+1)*(i+2)/6;
			
			if(n-tk < 0 || tk%2==0) continue;
			
			if(map[n-tk] > 0) {
				if(min > mapb[n-tk]) {
					min = mapb[n-tk];
				}
			}
			else if(min > (instant=f(n-tk))) {
				min = instant;
			}
		}
			
			return 1+min;
	}
}