import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		int n = s.length;
		boolean[] gat = new boolean[n];
		for(int i = 0; i < n-1; i++){
			if(s[i] == 'R' && s[i+1] == 'L'){
				gat[i] = true;
			}
		}
		int[] res = new int[n];
		int c = 0, d = 0;
		for(int i = 0; i < n-1; i++){
			if(s[i] == 'R'){
				if(i % 2 == 0) c++;
				else d++;
			}
			if(gat[i]){
				if(i % 2 == 0){
					res[i] += c; res[i+1] += d;
				}
				else{
					res[i] += d; res[i+1] += c;
				}
				c = 0; d = 0;
			}
		}
		c = 0; d = 0;
		for(int i = n-1; i >= 0; i--){
			if(s[i] == 'L'){
				if(i % 2 == 0) c++;
				else d++;
			}
			if(gat[i]){
				if(i % 2 == 0){
					res[i] += c; res[i+1] += d;
				}
				else{
					res[i] += d; res[i+1] += c;
				}
				c = 0; d = 0;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int k: res){
			sb.append(k+" ");
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString().trim());
		bw.write("\n");
		bw.flush();
	}

}
