package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	 public static void main(String[] args) {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
	        BufferedReader br = new BufferedReader(
	        		new InputStreamReader(System.in));
	        int days = 100000;
	        int[] dayMap = null; 
	        try {
				days = Integer.parseInt(br.readLine());
				String[] str = br.readLine().split(" ");
		        dayMap = new int[days];
				for(int i = 0 ; i < days ; i++){
					dayMap[i] = Integer.parseInt(str[i]);
				}
			} catch (NumberFormatException e) {
			} catch (IOException e) {}
	        int cnt = 0;
	        int disp = 0;
	        for(int i = 0 ; i < days - 7 ; i++){
	        	int holiday = 0;
				for(int j = i ; (j < i+7) && (holiday < 2); j++){
					int now = dayMap[j];
					if(now == 0){
						holiday++;
					}
				}
				if(holiday >= 2){
					cnt++;
				}else{
					if(disp < cnt){
						disp = cnt;
					}
					cnt = 0;
				}
			}
	        if(disp < cnt){
				disp = cnt + 7;
			}
	        System.out.println(disp);
	 }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String[] spl = br.readLine().split(" ");
		int n = Integer.parseInt(spl[0]);
		int m = Integer.parseInt(spl[1]);
		
		for(int i = 0 ; i < num ; i++){
			d[i] = Integer.parseInt(spl[i]);
		}
		Arrays.sort(d);
		
		int t[] = new int[m];
		spl = br.readLine().split(" ");
		for(int i = 0 ; i < m ; i++){
			t[i] = Integer.parseInt(spl[i]);
		}
		boolean flg = true;
		for(int i = 0 ; i < m ; i++){
			flg = true;
			for(int j = 0 ; j < num ; j++){
				if(d[j] > t[i]){
					break;
				}else if(d[j] == t[i]){
					d[j] = -1;
					flg = false;
					break;
				}
			}
			if(flg){
				break;
			}
		}
		if(flg){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
		
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuffer sb = new StringBuffer(s);
		int f = 0;
		int cnt = 0;
		while((f = s.indexOf("101")) != -1){
			s = s.replaceFirst("101", "10");
			cnt++;
		}
		int cnt2 = 0;
		s = sb.reverse().toString();
		while((f = s.indexOf("101")) != -1){
			s = s.replaceFirst("101", "10");
			cnt2++;
		}
		cnt = cnt>cnt2 ? cnt : cnt2;
		System.out.println(cnt);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String[] spl = br.readLine().split(" ");
		int n = Integer.parseInt(spl[0]);
		int m = Integer.parseInt(spl[1]);
		int map[][] = new int[n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				map[i][j] = -1;
			}
		}
		for(int i = 0 ; i < m ; i++){
			spl = br.readLine().split(" ");
			int a = Integer.parseInt(spl[0])-1;
			int b = Integer.parseInt(spl[1])-1;
			map[a][b] = 1;
			map[b][a] = 1;
		}
		int cnt = -1;
		int cnt1 = 0;
		while(cnt != cnt1){
			cnt = cnt1;
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < n-i ; j++){
					if(map[j][i] == 1){
						for(int k = 0 ; k < n ; k++){
							if(map[k][j] == 1 && i != k){
								for(int l = 0 ; l < n ; l++){
									if(map[l][k] == 1 && i != l && j != l && map[i][l] ==-1
											&& i != k ){
										map[i][l] =1;
										map[l][i] =1;
										map[j][i] =-1;
										cnt1++;
									}
								}
							}
						}
					}
				}
			}
		}
			System.out.println(cnt);
	}
}
