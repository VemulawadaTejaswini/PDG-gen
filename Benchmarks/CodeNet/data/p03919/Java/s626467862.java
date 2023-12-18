import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		String alp = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < h; i++){
			String[] s = br.readLine().split(" ");
			for(int j = 0; j < w; j++){
				if(s[j].equals("snuke")){
					sb.append(alp.substring(j,j+1)).append(i+1);
					System.out.println(sb);
				}
			}
		}
	}
}