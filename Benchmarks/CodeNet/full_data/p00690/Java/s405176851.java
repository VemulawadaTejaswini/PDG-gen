import java.util.*;

public class Main {
	int ans;
	ArrayList<Integer> ansList;
	int n;
	int [][] pass;
	private void solve(int sum, ArrayList<Integer> list){
		if(ans < sum){
			ans = sum;
			ArrayList<Integer> work = new ArrayList<Integer>();
			work.addAll(list);
			ansList =work;
		}
		//find
		int last = list.get(list.size() - 1);
		//System.out.println(last + " " + deep + " " + list.toString());
		for(int i=0; i < n; i++){
			//check a duplicate pass
			
			if(check(last,i,list) && pass[last][i] != -1){
				//System.out.println(last + " " + i + " " + pass[last][i] );
				list.add(i);
				solve(sum + pass[last][i], list);
				list.remove(list.size()-1);
			}
		}
	}
	
	private boolean check(int last , int now, ArrayList<Integer> list){
		for(int i=0; i < list.size()-1; i++){
			if((list.get(i) == last && list.get(i+1) == now) || (list.get(i) == now && list.get(i+1) == last)){
				return false;
			}
		}
		return true;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			pass = new int[n][n];
			for(int i=0; i < n; i++) Arrays.fill(pass[i], -1);
			for(int i=0; i < m; i++){
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() - 1;
				int dis = sc.nextInt();
				pass[from][to] = dis;
				pass[to][from] = dis;
			}
			ans = 0;
			ansList = new ArrayList<Integer>();
			for(int i=0; i < n; i++){
				ArrayList<Integer> work = new ArrayList<Integer>();
				work.add(i);
				solve(0,work);
			}
			//print
			//System.out.print("ANS= ");
			System.out.println(ans);
			System.out.print(ansList.get(0) + 1);
			for(int i=1; i < ansList.size(); i++){
				System.out.print(" " + (ansList.get(i) + 1));
			}
			System.out.println();
			//debug
//			System.out.println("debug=");
//			for(int i=0; i < n; i++){
//				for(int j=0; j < n; j++){
//					System.out.print(pass[i][j] +" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}