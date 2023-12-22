import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, y, m, d;
	public static void main(String[] args) {
		while(read()){
			//solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			y = sc.nextInt();
			m = sc.nextInt();
			d = sc.nextInt();
			solve();
		}
		return true;
	}
	
	static void solve(){
		int[] day = {20, 19, 20, 19, 20, 19, 20, 19, 20, 19};
		int res = 0;
		int year = 999;
		while(year > y){
			if(year % 3 == 0){
				res += 200;
			}else{
				res += 195;
			}
			year--;
		}
		if(y % 3 == 0){
			res += 200-((m-1)*20+d)+1;
		}else{
			int days = 0;
			for(int i = 0; i < m-1; i++){
				days += day[i];
			}
			res += 195-(days+d)+1;
		}
		System.out.println(res);
	}

}