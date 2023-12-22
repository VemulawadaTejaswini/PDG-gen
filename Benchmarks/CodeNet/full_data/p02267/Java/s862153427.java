import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]){
		int n=0,q=0;
		String S_String="", T_String = "";
		int[] S,T;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			n = Integer.parseInt(br.readLine());
			S_String = br.readLine();
			q = Integer.parseInt(br.readLine());
			T_String = br.readLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		S = StringToArray(S_String,n);
		T = StringToArray(T_String,q);
		int result = counter(n,q,S,T);
		System.out.println(result);
	}
	private static int counter(int n,int q, int[] S,int[] T){
		int[] temp;
		int buf;
		int counter = 0;
		Arrays.sort(S);
		Arrays.sort(T);
		if(n<q){
			temp=S;
			S = T;
			T = temp;
			buf = n;
			n=q;
			q=buf;
		}
		buf = 0;
		for(int i=0;i<q;i++){
			for(int j=buf;j<n;j++){
				if(S[j]==T[i]){
					counter++;
				}else if (S[j]>T[i]){
					buf = j;
					break;
				}
			}
		}
		return counter;
	}
	private static int[] StringToArray(String input,int number){
		int[] output = new int[number];
		StringTokenizer st = new StringTokenizer(input," ");
		for(int i=0;i<number;i++){
			output[i] = Integer.parseInt(st.nextToken());
		}
		return output;
	}
}