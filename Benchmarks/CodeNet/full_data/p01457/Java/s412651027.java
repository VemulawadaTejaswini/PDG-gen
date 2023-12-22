import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int left = 0;
		int right = 0;
		String x = sc.nextLine();
		for(int z=0;z<n;z++){
			String p = sc.nextLine();
			int now = 0;
			int flag = 0;
			for(int i=0;i<p.length();i++){
				if(p.charAt(i)=='('){
					now = i;
					flag = 1;
				}
				else if(p.charAt(i)==')'){
					now = i;
					flag = 2;
				}
			}
			int count = 0;
			for(int i=now+2;i<p.length();i++){
				count += ((int)p.charAt(i)-(int)'0')*Math.pow(10,p.length()-i-1);
			}
			if(flag==1){
				left += count;
			}
			else if(flag==2){
				right += count;
			}
			if(left==right){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}