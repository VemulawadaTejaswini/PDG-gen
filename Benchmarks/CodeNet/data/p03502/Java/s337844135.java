import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int f = 0;
		for(int i=0;i<n.length();i++){
			f += (int)n.charAt(i) - (int)'0';
		}
		int x = Integer.parseInt(n);
		if(x%f==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}