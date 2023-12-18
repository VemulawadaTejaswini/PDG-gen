import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n, m;
	int[] p; 
	Pair[] pairs;
	public void run(){
		n = sc.nextInt();
		m = sc.nextInt();
		p = new int[n];
		for(int i = 0; i < n; i++){
			p[i] = sc.nextInt() - 1;
		}
		pairs = new Pair[m];
		for(int i = 0; i < m; i++){
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			if(x < y) pairs[i] = new Pair(x, y);
			else pairs[i] = new Pair(y, x);
		}
		Arrays.sort(pairs, new Comparator<Pair>(){
			public int compare(Pair o1, Pair o2){
				return Integer.compare(o1.first, o2.first);
			}
		});
		solve();
	}
	public void solve(){
		int[] list = new int[n];
		
		int gnum = 0;
		for(int i = 0; i < m; i++){
			Pair npair = pairs[i];
			int check1 = list[npair.first];
			int check2 = list[npair.second];
			
			int g = 0;
			
			if(check1 == 0 && check2 == 0){
				gnum = gnum + 1;
				g = gnum;
			}
			else if(check1 == 0){
				g = check2;
			}
			else if(check2 == 0){
				g = check1;
			}
			else{
				g = check1;
				for(int j = 0; j < n; j++){
					if(list[j] == check2){
						list[j] = check1;
					}
				}
			}
			
			list[npair.first] = g;
			list[npair.second] = g;
		}
		
		int ans = 0;
		
		for(int i = 0; i < n; i++){
			if(list[i] == list[p[i]]){
				ans = ans + 1;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
}
