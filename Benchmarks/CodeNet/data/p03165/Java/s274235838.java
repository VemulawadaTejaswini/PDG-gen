import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		
		Reader rd = new Reader();
		
		String str1 = rd.next();
		String str2 = rd.next();
		int m = str1.length();
		int n = str2.length();
		String[][] str = new String[m+1][n+1];
		for(String[] stri : str){
			Arrays.fill(stri,"");
		}
		boolean matched = false;
		
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				//System.out.println(str1.charAt(i-1) + " " + str2.charAt(j-1) + " " + matched);
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					//matched = true;
					char c = str1.charAt(i-1);
					str[i][j] = str[i-1][j-1] + String.valueOf(c);
				}
				else{
					set_min(str, i, j);
				}
				
				//for(String[] stri : str){
					//System.out.println(Arrays.toString(stri));
				}
			
			}
		System.out.println(str[m][n]);
	}
	public static void set_min(String[][] str, int i, int j){
		if(str[i-1][j].length() < str[i][j-1].length()){
			str[i][j] = str[i][j-1];
		}
		else{
			str[i][j] = str[i-1][j];
		}
	}

	static void sort(int[] ar){
		ArrayList<Integer> ls = new ArrayList<>();
		for(int i=0; i<ar.length; i++) ls.add(ar[i]);
		Collections.sort(ls);
		for(int i =0; i<ls.size(); i++) ar[i] = ls.get(i);
	}
}

class Reader { 
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tok = new StringTokenizer("");
	static String next() {
		while(!tok.hasMoreTokens()){
			try{
				tok = new StringTokenizer(bf.readLine());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return tok.nextToken();
	} 
	static int nextInt() {
		return Integer.parseInt(next());
	}
}
