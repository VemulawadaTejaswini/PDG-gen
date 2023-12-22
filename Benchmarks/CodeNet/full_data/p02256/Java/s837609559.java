
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x<y){
			int tmp = x;
			x = y;
			y = tmp;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean[] prime = new boolean[y+1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;

		for(int i=2;i<=y;i++){
			if(prime[i]){
				list.add(i);
				for(int j=i*2;j<=y;j+=i){
					prime[j] = false;
				}
			}
		}

		int ans = 1;
		for(int i=0;i<list.size();i++){
			int z = list.get(i);
			if(x%z==0 && y%z==0){
				ans *= z;
				i--;
				x /= z;
				y /= z;
			}
		}

		System.out.println(ans);

	}
}


