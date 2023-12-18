import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] str = br.readLine().split(" ");
		int k = Integer.parseInt(str[0]);
		int t = Integer.parseInt(str[1]);
		if(t==1){
			int n = Integer.parseInt(br.readLine());
			sb.append(n-1);
			System.out.println(sb);
			return;
		}

		String[] str2 = br.readLine().split(" ");
		int[] a = new int [t];
		int max = -1;
		int min = 99999;
		int num = -1;
		for(int i = 0; i < t; i++){
			int cake = Integer.parseInt(str2[i]);
			a[i] = cake;
			if(cake>max){
				max = cake;
				num = i;
			}
		}
		a[num]--;
		int past = num;
		while(true){
			max = -1;
			int maxnum = -1;
			boolean rest = false;
			for(int i = 0; i < t; i++){
				if(i==past || a[i]==0)
					continue;
				if(a[i]>max){
					rest = true;
					max = a[i];
					maxnum = i;
				}
			}
			if(max!=-1){
				a[maxnum]--;
				past = maxnum;
			}
			if(!rest){
				sb.append(a[past]);
				System.out.println(sb);
				break;
			}
		}
	}
}