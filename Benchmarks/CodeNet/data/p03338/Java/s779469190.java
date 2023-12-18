import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N = scn.nextInt();
		String S = scn.next();
		int[] left = new int[N-1];
		int[] right = new int[N-1];
		boolean[] visited = new boolean[26];
		for(int i=0;i<N-1;i++){
			char ch =S.charAt(i);
			if(!visited[ch-'a']){
				left[i]++;
				visited[ch-'a']=true;	
			}
			if(i!=0){
					left[i]+=left[i-1];
			}
		}
		visited=new boolean[26];
		for(int i=N-2;i>=0;i--){
			char ch =S.charAt(i+1);
			if(!visited[ch-'a']){
				right[i]++;
				visited[ch-'a']=true;
			}
			if(i!=N-2){
					right[i]+=right[i+1];
			}
		}
		int idx = -1;
		int min=Integer.MAX_VALUE;
		int[] dif = new int[N-1];
		for(int i=0;i<N-1;i++){
		//	System.out.println("["+left[i]+", "+right[i]+
		//		"]");
			dif[i]=Math.abs(left[i]-right[i]);
			if(dif[i]<min){
				min=dif[i];
				idx=i;
			}
		}
		System.out.println(Math.min(left[idx], right[idx]));	
	}
}
