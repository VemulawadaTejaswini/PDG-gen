import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	static BitSet[] b;
	static int n;

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] l = new int [2*n];
		for(int i = 0; i < 2*n; i++){
			l[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(l);
		int sum = 0;
		for(int i = 0; i < 2*n; i+=2){
			sum += l[i];
		}
		sb.append(sum);
		System.out.println(sb);
	}
}