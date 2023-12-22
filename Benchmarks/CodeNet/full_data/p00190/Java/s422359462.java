import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	static int[][] move = new int[][] {
								{2},
					   {2,5},{0,1,3,6},{2,7},
			   {5},{1,4,6,9},{2,5,7,10},{3,6,8,11},{7},
			          {5,10},{6,9,11,12},{7,10},
			          			{10}
			          };
 	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = "0123456789AB0";
		dfs(0,0,12,first);
		System.out.println(map.size());
		IN:while(true) {
			char[] data = new char[13];
			for(int i = 0; i < 13; i++) {
				String tmp = sc.next();
				if(tmp.equals("-1")) break IN;
				if(tmp.equals("10")) tmp = "A";
				if(tmp.equals("11")) tmp = "B";
				data[i] = tmp.charAt(0);
			}
			if(map.containsKey(String.valueOf(data))) {
				System.out.println(map.get(String.valueOf(data)));
			}
			else {
				System.out.println("NA");
			}
			
		}
	}
	static String swap(int a, int b, String c) {
		char[] x = c.toCharArray();
		char tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
		String cx = String.valueOf(x);
		return cx;
	}
	static void dfs(int a, int b1,int b2, String c) {
		if(a >= 20) return;
		if(map.containsKey(c)) {
			if(map.get(c) <= a) {
				return;
			}
			else {
				map.put(c, a);
			}
		}
		else {
			map.put(c, a);
		}
		for(int i = 0; i < 13; i++) {
			if(b1 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b2) {
						c = swap(b2,b1,c);
						dfs(a,b2,b1,c);
						c = swap(b2,b1,c);
					}
					else {
						c = swap(move[i][j],b1,c);
						dfs(a+1,move[i][j],b2,c);
						c = swap(move[i][j],b1,c);
					}
				}
			}
			if(b2 == i) {
				for(int j = 0; j < move[i].length; j++) {
					if(move[i][j] == b1) {
						c = swap(b2,b1,c);
						dfs(a,b2,b1,c);
						c = swap(b2,b1,c);
					}
					else {
						c = swap(move[i][j],b2,c);
						dfs(a+1,b1,move[i][j],c);
						c = swap(move[i][j],b2,c);
					}
				}
			}
		}
	}
	

}