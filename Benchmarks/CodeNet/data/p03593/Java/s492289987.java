import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().input().solve().output();
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	int H = 0;
	int W = 0;
	String[] matrix = null;
	int[] charCount = new int[26]; 
	boolean ans = true;
	public Main input() throws IOException {
		String[] tmp = br.readLine().split(" ");
		H = Integer.parseInt(tmp[0]);
		W = Integer.parseInt(tmp[1]);
		matrix = new String[H];
		for(int i=0; i<H; i++) {
			matrix[i] = br.readLine();
		}
		return this;
	}

	public Main solve() throws IOException {
		for(int i=0; i<H; i++) {
			lineCheck(matrix[i],charCount);
		}
		int maxOdd = (H%2) * (W%2);
		int maxMultiple2 = (H/2)*(W%2) + (W/2)*(H%2);
		int countOdd=0;
		int countMultiple2=0;
		for(int i=0; i<26; i++) {
			if(charCount[i]%4 != 0){
				if(charCount[i]%2 != 0){
					countOdd++;
					if(countOdd>maxOdd){
						ans=false;
						return this;
					}
				}else{
					countMultiple2++;
					if(countMultiple2>maxMultiple2){
						ans=false;
						return this;
					}
				}
			}
		}
		return this;
	}
	
	public Main output() {
		out.println(ans ? "Yes" : "No");
		out.flush();
		return this;
	}
	
	private void lineCheck(String s, int[] check) {
		int len = s.length();
		for(int i=0; i<len; i++) {
			check[s.charAt(i)-'a']++;
		}
	}
}