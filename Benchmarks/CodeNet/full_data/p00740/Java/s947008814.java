import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, p;
	static int[] player;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		p = sc.nextInt();
		if( n == 0 && p == 0)return false;
		return true;
	}
	
	static void solve(){
		player = new int[n];
		int user = 0;
		while(true){
			if(p != 0){
				if(p == 1){
					if(isFinished(user))break;
				}
				p--; player[user]++;
			}else{
				p += player[user]; player[user] = 0;
			}
			user++;
			user = user%player.length;
		}
		System.out.println(user);
	}
	
	static boolean isFinished(int x){
		boolean isEnd = true;
		for(int i = 0; i < player.length; i++){
			if(i != x && player[i] != 0)isEnd = false;
		}
		return isEnd;
	}

}