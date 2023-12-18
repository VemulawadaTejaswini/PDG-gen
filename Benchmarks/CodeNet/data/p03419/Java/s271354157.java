import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long count = 0;

		if(n==1 && m==1){
			count = 0;
		}
		if(n==1 || m==1){
			count = n*m - 2;
		}
		else{
			count = n*m - (2*n + 2*m - 4);
		}
		
		System.out.println(count);
	}
}