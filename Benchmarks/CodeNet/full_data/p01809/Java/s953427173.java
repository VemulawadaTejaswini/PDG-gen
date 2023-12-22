import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		boolean[] judge = new boolean[(int)Math.sqrt(1000000000)+5];
		Arrays.fill(judge,true);
		judge[0] = false;
		judge[1] = false;
		for(int i=2;i<judge.length;i++){
			if(judge[i]){
				if(p%i==0 && q%i==0){
					p /= i;
					q /= i;
				}
				for(int j=i*2;j<judge.length;j+=i){
					judge[j] = false;
				}
			}
		}
		for(int i=2;i<judge.length;i++){
			if(judge[i] && q%(i*i)==0){
				q /= i;
			}
		}
		System.out.println(q);
	}
}