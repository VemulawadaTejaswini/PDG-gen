

import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i=0;i<h;i++){
			s[i] = sc.next();
		}
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		boolean flag = true;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				boolean judge = true;
				if(s[i].charAt(j) == '#'){
					for(int k=0;k<4;k++){
						if(i+dx[k]<0 || i+dx[k]>=h){
							continue;
						}
						if(j+dy[k]<0 || j+dy[k]>=w){
							continue;
						}
						if(s[i+dx[k]].charAt(j+dy[k])=='#'){
							judge = false;
						}
					}
					if(judge){
						flag = false;
					}
				}
			}
		}
		if(flag){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");		
		}
	}
}
