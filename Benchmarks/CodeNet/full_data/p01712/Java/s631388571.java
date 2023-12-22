import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		calc(n, w, h);
	}
	public void calc(int n, int w, int h){
		char[] x = new char[w];
		char[] y = new char[h];
		
		for(int i = 0; i < n; i++){
			int nx = sc.nextInt();
			int ny = sc.nextInt();
			int nw = sc.nextInt();
			
			for(int k = 0; k < nw+1; k++){
				if(nx-k >= 0 && nx-k < w) x[nx-k] = 1;
				if(ny-k >= 0 && ny-k < h) y[ny-k] = 1;
				if(k < nw) {
					if(nx+k >= 0 && nx+k < w) x[nx+k] = 1;
					if(ny+k >= 0 && ny+k < h) y[ny+k] = 1;
				}
			}
		}
		
		char flag = 1;
		for(int i = 0; i < w; i++){
			if(x[i] == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 0){
			flag = 1;
			for(int j = 0; j < h; j++){
				if(y[j] == 0) {
					flag = 0;
					break;
				}
			}
		}
		
		if(flag == 1) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}