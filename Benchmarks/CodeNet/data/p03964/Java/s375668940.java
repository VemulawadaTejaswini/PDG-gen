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
		int[] t = new int [n];
		int[] a = new int [n];
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			t[i] = Integer.parseInt(str[0]);
			a[i] = Integer.parseInt(str[1]);
		}
		int gt = t[0];
		int ga = a[0];
		for(int i = 1; i < n; i++){
			int nt = t[i];
			int na = a[i];
			while(true){
				if(1d*nt/na < 1d*gt/ga){
					ga++;
				}
				if(1d*na/nt < 1d*ga/gt){
					gt++;
				}
				if(1d*na/nt == 1d*ga/gt)
					break;
			}
		}
		sb.append(ga+gt);
		System.out.print(sb);
	}
}