import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Data[] AX = new Data[n];
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < n; i++) {
			AX[i] = new Data(sc.next(),sc.nextInt());
			map.put(AX[i].name, i);
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			String s = sc.next();
			String t = sc.next();
			int idA = map.get(s).intValue();
			int idB = map.get(t).intValue();
			
			if(AX[idA].x < AX[idB].x) {
				dfs(AX[idB],AX[idA].x,AX[idA].c);
			}
			else if(AX[idA].x > AX[idB].x) {
				dfs(AX[idA],AX[idB].x,AX[idA].c);
			}
			else if(AX[idA].c == AX[idB].c) continue;
			else 
			dfs(AX[idA],AX[idB].x,AX[idA].c);
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			count += AX[i].x;
		}
		System.out.println(count);
		
	}
	static void dfs(Data a, int B, int C) {
		if(a.x == B && a.c == C) return;
		a.x = B;
		a.c = C;
		for(int i = 0; i < a.ar.size(); i++) {
			dfs(a.ar.get(i),B,C);
		}
	}
	
	static class Data {
		static int C = 0;
		
		String name;
		int    x;
		int    c;
		ArrayList<Data> ar = new ArrayList<Data>();
		Data(String a, int b) {
			name = a;
			x = b;
			c = C++;
		}
	}
}