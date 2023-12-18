import java.util.Scanner;
 
class Main {
	int n;
	int[] h;
	int[] cost;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		h = new int[n];
		cost = new int[n];
		for(int i = 0; i < n;i++){
			h[i] = sc.nextInt();
			cost[i] = Integer.MAX_VALUE;
		}
		cost[0] = 0;
	}
	int cntString(String str,char target){
		int cnt = 0;
		for(char s : str.toCharArray()){
			if(s == target){
				cnt++;
			}
		}
		return cnt;
	}
	boolean[] checked;
	void solve(){
		checked = new boolean[n];
		for(int i=1;i<n;i++) checked[i] = false;
		checked[0] = true;
		System.out.println(reSolve(n-1));
	}
	int reSolve(int num){
		if(checked[num]) return cost[num];
		cost[num] = Math.min(cost[num], reSolve(num-1)+Math.abs(h[num]-h[num-1]));
		if (num>1) cost[num] = Math.min(cost[num], reSolve(num-2)+Math.abs(h[num]-h[num-2]));
		checked[num] = true;
		return cost[num];
	}
}
