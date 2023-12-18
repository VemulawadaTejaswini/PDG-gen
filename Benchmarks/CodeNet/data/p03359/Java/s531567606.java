
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		boolean flag = false;
		for(int i=1;i<=12;i++){
			for(int j=1;j<=31;j++){
				if(i==j){
					count++;
				}
				if(i==a && j==b){
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}
		}

		System.out.println(count);
	}
}
