import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] dg=new int[n];
		ArrayList<Integer>[] list=new ArrayList[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<n+m-1; i++){
			int a =sc.nextInt()-1;
			int b =sc.nextInt()-1;
			dg[b]++;
			list[a].add(b);
		}
		int root=0;
		for(int i=0; i<n; i++){
			if(dg[i]==0){
				root=i;
				break;
			}
		}
		int[] ans=new int[n];
		LinkedList<Integer> que=new LinkedList<>();
		que.add(root);
		while(!que.isEmpty()){
			int g=que.poll();
			for(int i:list[g]){
				dg[i]--;
				if(dg[i]==0){
					ans[i]=g+1;
					que.add(i);
				}
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}
