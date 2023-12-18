import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		boolean[] flag = new boolean[n];
		boolean[] flag2 = new boolean[n];
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1'){
				flag[i] = true;
				flag2[i] = true;
			}
		}
		int count = 0;
		for(int i=0;i<s.length()-2;i++){
			if(flag[i] && !flag[i+1] && flag[i+2]){
				flag[i] = !flag[i];
				flag[i+1] = !flag[i+1];
				flag[i+2] = !flag[i+2];
				count++;
				if(i!=0){
					i--;
				}
			}
		}
		int counter = 0;
		for(int i=s.length()-1;i>=2;i--){
			if(flag[i] && !flag[i-1] && flag[i-2]){
				flag[i] = !flag[i];
				flag[i-1] = !flag[i-1];
				flag[i-2] = !flag[i-2];
				counter++;
				if(i!=s.length()-1){
					i++;
				}
			}
		}
		System.out.println(Math.max(count,counter));
	}
}