import java.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main{
	static int N,M;
	static int[] List;
	static int[][] city;
	static int[] Answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		M = ss.nextInt();
		List = new int[M];
		city = new int[M][4];
		for (int i = 0; i < M; i++) {
			city[i][0] = ss.nextInt();
			city[i][1] = ss.nextInt();	
			city[i][2] = 1;
			city[i][3] =i;
		}
		makesort(city , 1 , 0, M-1);
		for (int i = 1; i < M; i++) {
			int j;
			for ( j = i-1; j >= 0; j--) {
				if(city[i][0]!=city[j][0])continue;
				if(city[i][0]==city[j][0]) {
					city[i][2]= city[j][2]+1 ;
					break;
				}
			}
		}
		makesort(city , 3 , 0, M-1);
		for (int i = 0; i < M; i++) {
			String aa = Integer.toString(city[i][0]);
			int len = aa.length();
			int n = 6-len;
			for (int j = 0; j < n; j++) {
				System.out.print("0");
			}
			System.out.print(city[i][0]);
			String bb = Integer.toString(city[i][2]);
			int len1 = bb.length();
			int n1 = 6-len1;
			for (int j = 0; j < n1; j++) {
				System.out.print("0");
			}
			System.out.print(city[i][2]);
			System.out.println();

		}
		
	}
	
	private static void makesort(int[][] s, int x, int low,int high) {
		int l = low;
		int h = high;
		int po = s[l][x];
		while (l<h) {
			while(l<h&&s[h][x]>=po) {
				h--;
				if(l<h) {
					int[] ss;
					ss = s[h];
					s[h] = s[l];
					s[l] = ss;
				}
				while(l<h&&s[h][x]<=po)
					l++;
				if(l<h){
					int[] ss;
					ss = s[h];
					s[h] = s[l];
					s[l] = ss;
					 }
			}
			h--;
		}
		for (int j = 0; j < M-1; j++) {
			for (int i = 0; i < M - 1-j; i++) {
				int[] ss;
				if (s[i][x]>s[i + 1][x]) {
					ss = s[i];
					s[i] = s[i + 1];
					s[i + 1] = ss;
				} 
			}
		}
		
	}
}