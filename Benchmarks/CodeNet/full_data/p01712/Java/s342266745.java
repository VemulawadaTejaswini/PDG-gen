
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
		int x = 0;
		int y = 0;
		int w = 0;
		long[][] map = new long[t+1][h+1];
		boolean flag = true;
		for(int i=0;i<n;i++){
			x = Integer.parseInt(stdIn.next());
			y = Integer.parseInt(stdIn.next());
			w = Integer.parseInt(stdIn.next());
			boolean flag1 = false;
			boolean flag2 = false;
			if(x-w>0){
				map[x-w][0]++;
			}
			else{
				map[0][0]++;
			}
			if(x+w<t && y-w>0){
				map[x+w+1][0]--;
			}
			else{
				flag1 = true;
			}
			if(y-w>0){
				map[0][y-w]++;
			}
			else if(x-w>0){
				map[0][0]++;
			}
			if(y+w<h && x-w>0){
				map[0][y+w+1]--;
			}
			else{
				flag2 = true;
			}
			if(y+w<h && x+w<t && flag1 && flag2){
				map[x+w+1][y+w+1]--;
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