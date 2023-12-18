import java.util.Scanner;
import java.util.ArrayDeque;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayDeque<Integer> que=new ArrayDeque<>();
		int[][] match=new int[n][n-1];
		int[] count=new int[n];
		for(int i=0; i<n; i++){
			que.add(i);
			for(int j=0; j<n-1; j++){
				match[i][j]=sc.nextInt()-1;
			}
		}
		int day=0;
		
		while(!que.isEmpty()){
			day++;
			ArrayDeque<Integer> tque=new ArrayDeque<>();
			boolean[] check=new boolean[n];
			while(!que.isEmpty()){
				int i=que.poll();
				if(count[i]==n-1){
					continue;
				}
				int tmp=match[i][count[i]];
				if(!check[tmp] && i==match[tmp][count[tmp]]){
					count[i]++;
					count[tmp]++;
					check[i]=true;
					check[tmp]=true;
					tque.add(i);
					tque.add(tmp);
					que.remove(tmp);
				}
			}
			que=tque;
		}
		for(int i=0; i<n; i++){
			if(count[i]<n-1){
				day=0;
				break;
			}
		}
		System.out.println(day-1);
	}
}
