

import java.util.Scanner;

public class Main{
	static String term = new String();
	static char t[][];
	static int n;
	static boolean tm[];
	
	
	static boolean bt(int m,int cnt){
		if(cnt == n-1) {
			if(t[0][0] == t[m][1]) return true;
			else return false;
		}
		for(int i=0; i<n; i++){
			if(i != m && t[i][0] == t[m][1] && !tm[i]){
				tm[i] = true;
				if(bt(i,cnt+1)) return true;
				tm[i] = false;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			t = new char[n][2];
			tm= new boolean[n];
			for(int i=0; i<n; i++){
				term = sc.next(); 
				int last = term.length() - 1;
				t[i][0] = term.charAt(0);
				t[i][1] = term.charAt(last);
			}
			if(bt(0,0)) System.out.println("OK");
			else System.out.println("NG");
		
		}
	}
}