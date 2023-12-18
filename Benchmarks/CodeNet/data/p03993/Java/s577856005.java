import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] a = new int [n];
		boolean[] done = new boolean [n];
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(str[i]) - 1;
		}
		int cnt = 0;
		for(int i = 0; i < n; i++){
			if(!done[i]){
				done[i] = true;
				int j = a[i];
				if(i==a[j]){
					done[j] = true;
					cnt++;
				}
			}
		}
		sb.append(cnt);
		System.out.println(sb);
	}
}