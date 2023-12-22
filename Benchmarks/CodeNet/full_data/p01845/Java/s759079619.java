import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int rn = sc.nextInt();
			int wn = sc.nextInt();
			int c = sc.nextInt();
			int r = sc.nextInt();
			if(rn==0 && wn==0 && c==0 && r==0){
				break;
			}
			int ans = 0;
			while(true){
				if((rn + ans*r)/c - wn >= 0){
					break;
				}
				ans++;
			}
			System.out.println(ans);
		}
	}
}