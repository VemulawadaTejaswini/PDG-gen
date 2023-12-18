import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] visit=new int[n][3];
		ArrayList<Integer>[] map=new ArrayList[n];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
			Arrays.fill(visit[i],Integer.MAX_VALUE);
		}
		for(int i=0; i<m; i++){
			int u=sc.nextInt()-1;
			int v =sc.nextInt()-1;
			map[u].add(v);
		}
		int s =sc.nextInt()-1;
		int t =sc.nextInt()-1;
		ArrayDeque<Integer>  que=new ArrayDeque<>();
		que.add(s);
		int count1=0;
		int count2=0;
		int count3=0;
		while(!que.isEmpty()){
			int j=que.poll();
			if(visit[j][count1%3]>count1){
				visit[j][count1%3]=count1;
				for(int i:map[j]){
					count3++;
					que.add(i);
				}
			}
			if(count2==0){
				count2=count3-1;
				count3=0;
				count1++;
			}else{
				count2--;
			}
		}
		if(visit[t][0]!=Integer.MAX_VALUE){
			System.out.println(visit[t][0]/3);
		}else{
			System.out.println(-1);
		}
	}
}


