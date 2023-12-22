import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int m = sc.nextInt();
			int nmin = sc.nextInt();
			int nmax = sc.nextInt();
			if(m == 0 && nmin == 0 && nmax == 0) break;
			calc(m, nmin, nmax);
		}
	}
	public void calc(int m, int nmin, int nmax){
		int diff = 0;
		int ans = 0;
		int[] p = new int[200];
		for(int i = 0; i < m; i++){
			p[i] = sc.nextInt();
		}
		for(int i = nmax; i > nmin -1; i--){
			if(p[i-1] - p[i] > diff){
				diff = p[i-1] - p[i];
				ans = i;
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}