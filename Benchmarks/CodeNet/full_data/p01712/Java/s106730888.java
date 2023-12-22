
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(stdIn.next());
		int t = Integer.parseInt(stdIn.next());
		int h = Integer.parseInt(stdIn.next());
		int[] x = new int[n];
		int[] y = new int[n];
		int[] w = new int[n];
		int[][] map = new int[t+1][h+1];
		boolean flag = true;
		for(int i=0;i<n;i++){
			x[i] = Integer.parseInt(stdIn.next());
			y[i] = Integer.parseInt(stdIn.next());
			w[i] = Integer.parseInt(stdIn.next());
		}
		for(int i=0;i<n;i++){
			if(x[i]-w[i]>=0){
				map[x[i]-w[i]][0]++;
			}
			else{
				map[0][0]++;
			}
			if(x[i]+w[i]<n){
				map[x[i]+w[i]+1][h]--;
			}
			if(y[i]-w[i]>=0){
				map[0][y[i]-w[i]]++;
			}
			else{
				map[0][0]++;
			}
			if(y[i]+w[i]<n){
				map[t][y[i]+w[i]+1]--;
			}
		}
		for(int i=0;i<=t;i++){
			for(int j=1;j<=h;j++){
				map[i][j] += map[i][j-1]; 
			}
		}
		for(int j=0;j<=h;j++){
			for(int i=1;i<=t;i++){
				map[i][j] += map[i-1][j];
			}
		}
		for(int i=0;i<=t;i++){
			for(int j=0;j<=h;j++){
				if(map[i][j]<=0){
					flag = false;
				}
			}
		}

		if(flag){
			out.println("Yes");
		}
		else{
			out.println("No");
		}
		out.flush();
	}
}