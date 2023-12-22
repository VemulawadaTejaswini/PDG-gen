import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	//2305 start
	int n, len;
	String [] data;
	String num;
	HashMap<String, String> map;
	int [] convert = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
	StringBuilder work;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n= sc.nextInt();
			if(n == 0) break;
			data = new String[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next();
			}
			num = sc.next();
			len = num.length();
			map = new HashMap<String, String>();
			for(int i = 0;i < n; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < data[i].length(); j++){
					int ind = data[i].charAt(j) - 'a';
					sb.append(convert[ind]);
				}
				map.put(data[i], sb.toString());
			}
			work = new StringBuilder();
			dfs(0);
			System.out.println("--");
		}
	}

	private void dfs(int first) {
		if(first == len){
			System.out.print(work.substring(1));
			System.out.println(".");
			return;
		}
		
		for(int i = 0; i < n; i++){
			int nowlen = data[i].length();
			if(nowlen + first > len) continue;
			String substr = num.substring(first, first + nowlen);
			if(substr.equals(map.get(data[i]))){
				work.append(" " + data[i]);
				dfs(first + nowlen);
				work.delete(work.length() - nowlen-1, work.length());
			}
			
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}