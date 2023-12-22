import java.util.*;
class Road{
	int from, to, time;
}
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Road[] road;
	static int[][]data, ans;
	static int[]cost;
	static int n, number_of_city;
	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		while(read()){
			ans = new int[1][2];
			ans[0][1] = Integer.MAX_VALUE;
			ans[0][0] = 0;
			for(int i = 0; i < number_of_city+1; i++){
				solve(i);
			}
			System.out.println(ans[0][0] + " " + ans[0][1]);
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;

		data = new int[n][2];
		cost = new int[n];
		number_of_city = 0;

		for(int i = 0; i < n; i++){
			data[i][0] = sc.nextInt(); data[i][1] = sc.nextInt();
			cost[i] = sc.nextInt();
			number_of_city = Math.max(number_of_city, data[i][0]);
			number_of_city = Math.max(number_of_city, data[i][1]);
		}

		road = new Road[2*n];

		for(int i = 0; i < n; i++){
			road[i] = new Road();
			road[i].from = data[i][0];
			road[i].to = data[i][1];
			road[i].time = cost[i];
		}
		for(int i = n; i < 2*n; i++){
			road[i] = new Road();
			road[i].from = road[i - n].to;
			road[i].to = road[i - n].from;
			road[i].time = road[i - n].time;
		}
		return true;
	}
	static void solve(int from){
		int[] d = new int[number_of_city+1];
		for(int i = 0; i < number_of_city+1; i++)
			d[i] = INF;
		d[from] = 0;
		while(true){
			boolean update = false;
			for(int i = 0; i < 2*n; i++){
				Road pass = road[i];
				if(d[pass.from] != INF && d[pass.to] > d[pass.from] + pass.time){
					d[pass.to] = d[pass.from] + pass.time;
					update = true;
				}
			}
			if(!update) break;
		}
		int res = 0;
		for(int i = 0; i < number_of_city+1; i++)
			res = res + d[i];
		if(res <= ans[0][1]){
			if(res == ans[0][1]){
				ans[0][0] = Math.min(from, ans[0][0]);
				ans[0][1] = res;
			}else{
				ans[0][0] = from;
				ans[0][1] = res;
			}
		}
	}
}