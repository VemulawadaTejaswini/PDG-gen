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
		int endcount=0;
		while(!que.isEmpty()){
			day++;
			ArrayDeque<Integer> tque=new ArrayDeque<>();
			for(int j=0; j<que.size(); j++){
				int i=que.poll();
				if(count[i]==n-1){
					endcount++;
					continue;
				}
				int tmp=match[i][count[i]];
				if(i==match[tmp][count[tmp]]){
					count[i]++;
					count[tmp]++;
					tque.add(i);
					tque.add(tmp);
					que.remove(tmp);
				}
			}
			que=tque;
		}
		if(endcount<n){
			day=-1;
		}
		System.out.println(day);
	}
}
