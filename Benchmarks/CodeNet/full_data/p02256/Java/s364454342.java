
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

		int ans = 1;
		for(int i=2;i<=y;i++){
			if(x%i == 0 && y%i==0){
				ans = i;
			}
		}

		System.out.println(ans);

	}
}


