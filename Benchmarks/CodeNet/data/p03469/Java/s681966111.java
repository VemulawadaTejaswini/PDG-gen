
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0;i<s.length();i++){
			if(i==3){
				System.out.print(8);
			}
			else{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}
}

