import java.util.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	boolean[] npri;
	int size = 100001;

	void solve(){
		get_pri();
		while(in.hasNext()){
			int n = in.nextInt();
			//if(n == 0) return;
			int ans = 0;
			for(int i = 1; i <= n; i++){
				if((!npri[i]) &&(!npri[n - i + 1])) ans++;
			}
			System.out.println(ans);
		}
	}
	
	void get_pri(){
		npri = new boolean[size];
		npri[0] = npri[1] = true;
		for(int i = 2; i < size; i++){
			if(!npri[i]){
				for(int j = i + i; j < size; j += i){
					npri[j] = true;
				}
			}
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }