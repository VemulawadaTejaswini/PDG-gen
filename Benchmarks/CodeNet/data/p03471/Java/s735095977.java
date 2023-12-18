
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		boolean flag = false;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n-i;j++){
				if(y==10000*i+5000*j+1000*(n-i-j)){
					flag = true;
					a = i;
					b = j;
					c = n-i-j;
				}
			}
		}
		if(flag){
			System.out.println(a+" "+b+" "+c);
		}
		else{
			System.out.println((-1)+" "+(-1)+" "+(-1));
		}
	}
}

