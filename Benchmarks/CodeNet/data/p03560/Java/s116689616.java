
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int min = 50000;
		int n = Integer.MAX_VALUE /100 / k; 
		for(int i=1;i<n;i++){
			String s = Integer.toString(k*i);
			int count = 0;
			for(int j=0;j<s.length();j++){
				count += (int)s.charAt(j) - (int)'0';
			}
			min = Math.min(min, count);
		}
		System.out.println(min);
	}
}
