import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] s = new int[n];
		int[] t = new int[n];
		int[] d = new int[n];
		int[] imosu = new int[100001];
		for(int i=0;i<n;i++){
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
			d[i] = sc.nextInt();
			imosu[s[i]]++;
			imosu[t[i]+1]--;
		}
		int max = 0;
		int count = 0;
		for(int i=0;i<100001;i++){
			count+=imosu[i];
			max = (int)Math.max(max,count);
		}
		System.out.println(max);
	}
}
