import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,Integer> d = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			if(d.containsKey(x)){
				int y = d.get(x);
				d.remove(x);
				d.put(x,y+1);
			}
			else{
				d.put(x,1);
			}
		}
		int m = sc.nextInt();
		int[] t = new int[m];
		for(int i=0;i<m;i++){
			t[i] = sc.nextInt();
		}
		boolean judge = true;
		for(int i=0;i<m;i++){
			if(d.containsKey(t[i])){
				if(d.get(t[i])==0){
					judge = false;
					break;
				}
				else{
					int y = d.get(t[i]);
					d.remove(t[i]);
					d.put(t[i],y-1);
				}
			}
			else{
				judge = false;
				break;
			}
		}
		if(judge){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}