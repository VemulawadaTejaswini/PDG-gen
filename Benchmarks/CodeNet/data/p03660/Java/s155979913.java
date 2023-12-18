import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>[] map=new ArrayList[n];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
		}
		for(int i=0; i<n-1; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			map[a].add(b);
			map[b].add(a);
		}
		ArrayDeque<Integer> q=new ArrayDeque<>();
		int[] disf=new int[n];
		Arrays.fill(disf,-1);
		disf[0]=0;
		q.add(0);
		while(!q.isEmpty()){
			int s=q.poll();
			for(int i:map[s]){
				if(disf[i]==-1){
					disf[i]=disf[s]+1;
					q.add(i);
				}
			}
		}
		int[] diss=new int[n];
		Arrays.fill(diss,-1);
		diss[n-1]=0;
		q.add(n-1);
		int fe=n-1;
		while(!q.isEmpty()){
			int s=q.poll();
			for(int i:map[s]){
				if(diss[i]==-1){
					diss[i]=diss[s]+1;
					if(diss[i]<disf[i]){
						fe--;
					}else{
						continue;
					}
					q.add(i);
				}
			}
		}
		if(fe>n-fe){
			System.out.println("Fennec");
		}else{
			System.out.println("Snuke");
		}
	}
}
