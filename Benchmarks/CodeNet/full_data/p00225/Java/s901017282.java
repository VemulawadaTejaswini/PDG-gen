import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	static boolean[] checknode;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			char[] in = new char['z' - 'a' + 1];
			char[] out = new char['z' - 'a' + 1];
			
			boolean[][] edge = new boolean['z' - 'a'+1]['z' - 'a'+1];
			boolean[]   isnode = new boolean['z' - 'a'+1];
			checknode = new boolean['z' - 'a' + 1];
			char start = 'a';
			for(int i = 0; i < n; i++) {
				char[] tmp = sc.next().toCharArray();
				if(i == 0)start = tmp[0];
				in[tmp[tmp.length-1] - 'a']++;
				out[tmp[0] - 'a']++;
				edge[tmp[0] - 'a'][tmp[tmp.length-1] - 'a'] = true;
				isnode[tmp[0] - 'a'] = isnode[tmp[tmp.length-1] - 'a'] = true;
			}
			
			boolean A = true;
			for(int i = 0; i < in.length; i++) {
				if(in[i] != out[i]) {
					A = false;
					break;
				}
			}
			
			if(A) {
				
				check(edge,start-'a');
				
				for(int i = 0; i < isnode.length; i++) {
					
					if(isnode[i] && !checknode[i]) {
						System.out.println(i);
						A = false;
						break;
					}
					
				}
			}
			
			System.out.println(A?"OK":"NG");
			
			
		}
	} 	
	static void check(boolean[][] a, int b) {
		checknode[b] = true;
		for(int i = 0; i < a[b].length; i++) {
			if(!a[b][i]) continue;
			if(checknode[i]) continue;
			check(a,i);
		}
	}

	
}