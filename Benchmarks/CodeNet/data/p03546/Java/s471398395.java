
import java.util.Scanner;

public class Main {
	
	static int [][]mp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		mp = new int [10][10];
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				mp[i][j] = Integer.parseInt(sc.next());  //i → j への魔力
			}
		}
		int [][]d = root();
		
		long ans = 0;
		
		for(int i = 0 ; i < h ;i++) {
			for(int j = 0 ; j < w ; j++) {
				int num = Integer.parseInt(sc.next());
				if(num == -1) continue;
		
				ans += d[num][1];
			}
		}
		
	System.out.println(ans);

}

	static int [][]root (){
		int [][]d = mp;
		for(int i = 0 ; i < 10 ;i++) {
			for(int j = 0 ; j < 10 ; j++) {
				for(int k = 0 ; k < 10 ; k++) {
					d[j][k] = Math.min(mp[j][i]+mp[i][k], d[j][k]);
				}		
			}
		}	
		return d;
		
		}
	}
