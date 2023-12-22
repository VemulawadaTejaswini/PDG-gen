
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] score = new int[4001];
		for(int i=0;i<n;i++){
			double b = sc.nextDouble();
			a[i] = (int)(b*1000);
		}

		for(int i=0;i<n;i++){
			score[a[i]]++;
		}		

		int now = 0;
		for(int i=0;i<=4000;i++){
			if(score[i]!=0){
				int tmp = score[i] - 1 + 3 * now;
				now += score[i];
				score[i] = tmp; 
			}
		}

		for(int i=0;i<n;i++){
			System.out.println(score[a[i]]);
		}

	}
}

