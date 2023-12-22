import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			String[] s = new String[n];
			for(int i=0;i<n;i++){
				s[i] = sc.next();
			}
			String[] t = new String[n];
			for(int i=0;i<n;i++){
				for(int j=0;j<s[i].length();j++){
					if(j==0){
						t[i] = s[i].substring(j,j+1);
					}
					if(j!=s[i].length()-1 && (s[i].charAt(j)=='a' || s[i].charAt(j)=='i' ||
						s[i].charAt(j)=='u' || s[i].charAt(j)=='e' ||
						s[i].charAt(j)=='o')){
						t[i] = t[i] + s[i].substring(j+1,j+2);
					}
				}
			}
			int max = 0;
			for(int i=0;i<n;i++){
				//System.out.println(t[i]);
				max = Math.max(max,t[i].length());
			}
			boolean judge = true;
			for(int k=1;k<=max;k++){
				judge = true;
				for(int i=0;i<n;i++){
					for(int j=i+1;j<n;j++){
						String a = t[i].substring(0,Math.min(k,t[i].length()));
						String b = t[j].substring(0,Math.min(k,t[j].length()));
						if(a.compareTo(b)==0){
							judge = false;
						}
					}
				}
				if(judge){
					System.out.println(k);
					break;
				}
				else if(k==max){
					System.out.println(-1);
					break;
				}
			}
		}
	}
}