
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int xx[] = new int[n];
		int yy[] = new int[n];
		int hh[] = new int[n];
		
		for(int i =0 ; i < n ;i++){
			xx[i] = sc.nextInt();
			yy[i] = sc.nextInt();
			hh[i] = sc.nextInt();
		}
		
		for(int x = 0; x <= 100; x++){
			for(int y = 0 ; y <= 100;y++){
				
				int h = -1;
				for(int i = 0; i < n; i++){
					if(hh[i] == 0){
						continue;
					}
					int dist = Math.abs(x - xx[i]);
					dist += Math.abs(y-yy[i]);
					h = dist+ hh[i];
					break;
				}
				
				boolean flag = true;
				for(int i = 0; i < n; i++){
					int dist = Math.abs(x - xx[i]);
					dist += Math.abs(y-yy[i]);
					if(Math.max(0, h-dist) != hh[i]){
						flag= false;
						break;
					}
				}
				if(flag){
					System.out.println(x+" "+y+" "+h);
					return;
				}
			}
		}
		
	}
}
