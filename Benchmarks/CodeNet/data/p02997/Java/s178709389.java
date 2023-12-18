import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<Edge> list=new ArrayList<>();
		int sum=0;
		for(int i=0; i<n-1; i++){
			list.add(new Edge(0,i+1));
			sum+=n-2-i;
		}
		if(sum<k){
			System.out.println(-1);
			return;
		}else if(sum>k){
			int a=sum-k;
			for(int i=1; i<n-1; i++){
				for(int j=i+1; j<n; j++){
					a--;
					list.add(new Edge(i,j));
					if(a==0){
						break;
					}
				}
				if(a==0){
					break;
				}
			}
		}
		System.out.println(n-1+sum-k);
		for(Edge i:list){
			System.out.println((i.u+1)+" "+(1+i.v));
		}
	}
	static class Edge{
		int u;
		int v;
		Edge(int u,int v){
			this.u=u;
			this.v=v;
		}
	}
}


