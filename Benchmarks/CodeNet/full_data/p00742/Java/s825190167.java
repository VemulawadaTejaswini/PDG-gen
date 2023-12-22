import java.util.Scanner;


public class Main {

	int[] pos;
	int[] num;
	boolean[] use;
	boolean[] usedigit;
	
	char[][] in;
	int ans;
	
	void solve(int cur){
		if(cur == pos.length){
			
			int sum = 0;
			for(int i = 0; i < in.length; i++){
				int tmp = 0;
				
				for(int j = 0; j < in[i].length; j++){
					
					int d = num[in[i][j] - 'A'];
					if(d == 0 && j == 0 && in[i].length != 1) return;
					
					tmp *= 10;
					tmp += d;
				}
				if(i == in.length - 1) sum -= tmp;
				else sum += tmp;
			}
			if(sum == 0) ans++;
			
			return;
		}
		for(int i = 0; i <= 9; i++){
			if(usedigit[i]) continue;
			usedigit[i] = true;
			
			num[pos[cur]] = i;
			solve(cur + 1);
			
			usedigit[i] = false;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			
			in = new char[n][];
			num = new int[26];
			use = new boolean[26];
			
			for(int i = 0; i < n; i++){
				in[i] = sc.next().toCharArray();
				for(int j = 0; j < in[i].length; j++)
					use[in[i][j] - 'A'] = true;
			}
			
			int[] tmppos = new int[26];
			int sz = 0;
			
			for(int i = 0; i < 26; i++)
				if(use[i]) tmppos[sz++] = i;
			pos = new int[sz];
			for(int i = 0; i < sz; i++) pos[i] = tmppos[i];
			
			
			usedigit = new boolean[10];
			ans = 0;
			solve(0);
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}